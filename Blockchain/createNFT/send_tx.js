// import {createAlchemyWeb3} from "@alch/alchemy-web3";

async function send_Tx() {
    const API_URL = 'https://eth-rinkeby.alchemyapi.io/v2/fZ_RlZZ0MpckxkK9EvQuSSPPAmwaVv5T'
    const PRIVATE_KEY = '19f4ed696f2209d4a80abc759e5c0053d6de0165eb06ba87abdf4f8119883725'
    const { createAlchemyWeb3 } = require("@alch/alchemy-web3");
    const web3 =  createAlchemyWeb3(API_URL);
    const frm = '0x7EC76bdc87CB0159222f5dbAb4522eA8F81a9635'
    const nonce = await web3.eth.getTransactionCount(frm, 'latest')
    const transaction = {
        'to' : '0xe52210f2b98e71a50cd6e207428cbd71a1da6cf7',
        'value' : 100000000000000000,
        'gas' : 30000,
        'maxFeePerGas' : 2500000000,
        'nonce' : nonce,
    };

    const signedTx = await web3.eth.accounts.signTransaction(transaction, PRIVATE_KEY);
    console.log("signedTx: " + signedTx);

    web3.eth.sendSignedTransaction(signedTx.rawTransaction, function (error, hash) {
        if (!error) {
            console.log("The hash of your transaction is: ",
                hash, "\n Check Alchemy's Mempool to view the status of your transaction!")
        } else {
            console.log("Something went wrong write submitting your transaction: ", error)
        }
    });
}

send_Tx();