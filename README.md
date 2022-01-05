# vol_converter

This service allows you to convert some values to each other:
- bls (barrels)
- gal (gallons)
- l (litres)

You have 6 way to convert:
- bls -> gal
- bls -> l
- gal -> bls
- gal -> l
- l -> bls
- l -> gal

Also you can type 'stop' in the first input line to stop the converter!

## Docker

Build:
- ***docker build -t vol_converter .***

Run:
- ***docker run -i vol_converter***
