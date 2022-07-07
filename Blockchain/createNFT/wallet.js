const Wallet = require("ethereumjs-wallet");
const fs = require("fs");

/**
 * 이더 지갑 생성 및 저장
 *
 */
// EthWallet 생성
function createEthWallet() {
    var Wallet = require('ethereumjs-wallet');
    const EthWallet = Wallet.default.generate();

    const address = EthWallet.getAddressString();
    const privateKey = EthWallet.getPrivateKeyString();

    console.log("address: " + address);
    console.log("privateKey: " + privateKey);

    const content
        = "address: "+address+"\n"+"privateKey: "+privateKey;

    const time = Date.now();
    const fileName = __dirname + "\\wallet\\ethWallet_" + time + ".txt"

    // 생성된 EthWallet 파일로 저장.
    const dir = fs.existsSync(__dirname + "\\wallet")
    // console.log(dir)

    function createFile() {
        fs.writeFile(fileName, content, err => {
            if (err) {
                console.error(err)
            }
        });
    }

    if (dir==true) {
        createFile();
    }
    else if (dir != true) {
        fs.mkdirSync(__dirname + "\\wallet");
        createFile();
    }
}

createEthWallet();


