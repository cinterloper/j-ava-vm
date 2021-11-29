#!/usr/bin/env bash
AVALANCHE_HOME=~/avalabs/avalanchego

#clone
git clone https://github.com/cinterloper/j-ava-vm

#build
mvn clean package

#install
cp -a target/j-ava-sdk-4.2.0.jar $AVALANCHE_HOME/build/plugins/j-ava-sdk
chmod +x $AVALANCHE_HOME/build/plugins/j-ava-sdk

#configure
#base58 padded string created by hand
cat << EOF > ~/.avalanchego/configs/vms/aliases.json
{
  "orMStuSyHrpSiUXEadkUSnyf9gQazDRKhYHYMBt6ZsHp6H567" : [
    "j-ava-vm",
    "j-ava-sdk"
  ]
}
EOF

#run
$AVALANCHE_HOME/build/avalanchego

# avalanchego(1078236)─┬─evm(1078992)─┬─{evm}(1078993)
#                      │              ├─{evm}(1078994)
#                      │              ├─{evm}(1078995)
#                      │              ├─{evm}(1078996)
#                      │              ├─{evm}(1078997)
#                      │              ├─{evm}(1078998)
#                      │              ├─{evm}(1078999)
#                      │              ├─{evm}(1079000)
#                      │              ├─{evm}(1079001)
#                      │              ├─{evm}(1079004)
#                      │              ├─{evm}(1079005)
#                      │              ├─{evm}(1079006)
#                      │              ├─{evm}(1079007)
#                      │              ├─{evm}(1079008)
#                      │              ├─{evm}(1079009)
#                      │              ├─{evm}(1079012)
#                      │              ├─{evm}(1079013)
#                      │              └─{evm}(1079014)
#                      ├─java(1079180)─┬─{java}(1079181)
#                      │               ├─{java}(1079182)
#                      │               ├─{java}(1079183)
#                      │               ├─{java}(1079184)
#                      │               ├─{java}(1079185)
#                      │               ├─{java}(1079186)
#                      │               ├─{java}(1079187)
#                      │               ├─{java}(1079188)
#                      │               ├─{java}(1079189)
#                      │               ├─{java}(1079190)
#                      │               ├─{java}(1079191)
#                      │               ├─{java}(1079192)
#                      │               ├─{java}(1079193)
#                      │               ├─{java}(1079194)
#                      │               ├─{java}(1079198)
#                      │               ├─{java}(1079199)
#                      │               ├─{java}(1079206)
#                      │               ├─{java}(1079207)
#                      │               ├─{java}(1079208)
#                      │               ├─{java}(1079209)
#                      │               ├─{java}(1079210)
#                      │               ├─{java}(1079213)
#                      │               ├─{java}(1079214)
#                      │               ├─{java}(1079215)
#                      │               ├─{java}(1079216)
#                      │               ├─{java}(1079217)
#                      │               ├─{java}(1079218)
#                      │               ├─{java}(1079219)
#                      │               ├─{java}(1079220)
#                      │               ├─{java}(1079221)
#                      │               ├─{java}(1079222)
#                      │               ├─{java}(1079223)
#                      │               ├─{java}(1079224)
#                      │               ├─{java}(1079225)
#                      │               ├─{java}(1079226)
#                      │               ├─{java}(1079227)
#                      │               ├─{java}(1079228)
#                      │               └─{java}(1079229)
#                      ├─{avalanchego}(1078237)
#                      ├─{avalanchego}(1078238)
#                      ├─{avalanchego}(1078239)
#                      ├─{avalanchego}(1078240)
#                      ├─{avalanchego}(1078241)
#                      ├─{avalanchego}(1078243)
#                      ├─{avalanchego}(1078244)
#                      ├─{avalanchego}(1078245)
#                      ├─{avalanchego}(1078246)
#                      ├─{avalanchego}(1078247)
#                      ├─{avalanchego}(1078248)
#                      ├─{avalanchego}(1078249)
#                      ├─{avalanchego}(1078250)
#                      ├─{avalanchego}(1078251)
#                      ├─{avalanchego}(1078252)
#                      ├─{avalanchego}(1078253)
#                      ├─{avalanchego}(1078254)
#                      ├─{avalanchego}(1078274)
#                      ├─{avalanchego}(1078329)
#                      ├─{avalanchego}(1078330)
#                      ├─{avalanchego}(1078331)
#                      ├─{avalanchego}(1078800)
#                      ├─{avalanchego}(1079350)
#                      ├─{avalanchego}(1081117)
#                      └─{avalanchego}(1081143)

