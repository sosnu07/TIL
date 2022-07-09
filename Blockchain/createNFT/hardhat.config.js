require("@nomiclabs/hardhat-waffle");

// This is a sample Hardhat task. To learn how to create your own go to
// https://hardhat.org/guides/create-task.html
task("accounts", "Prints the list of accounts", async (taskArgs, hre) => {
  const accounts = await hre.ethers.getSigners();

  for (const account of accounts) {
    console.log(account.address);
  }
});

// You need to export an object to set up your config
// Go to https://hardhat.org/config/ to learn more

/**
 * @type import('hardhat/config').HardhatUserConfig
 */

require('dotenv').config({path:__dirname+'/process.env'})
require("@nomiclabs/hardhat-ethers");

const {API_URL, METAMASK_PRIVATE_KEY} = process.env;

module.exports = {
  solidity: "0.8.4",
  defaultNetwork: "rinkeby",
  networks: {
    hardhat: {},
    rinkeby: {
      url: API_URL,
      accounts: [`0x${METAMASK_PRIVATE_KEY}`]
      // url:"https://eth-rinkeby.alchemyapi.io/v2/fZ_RlZZ0MpckxkK9EvQuSSPPAmwaVv5T",
      // accounts: [`0x71daa457c43a8885ba33922d381b383373b9686d685b7a5c85f5d3ebb37a6360`]
    }
  }
};
