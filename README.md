# Roman Numerals Kata [![CircleCI](https://circleci.com/gh/luiscarlin/roman-numerals-kata/tree/master.svg?style=svg)](https://circleci.com/gh/luiscarlin/roman-numerals-kata/tree/master)

Classic roman numerals kata converting arabic numbers to roman numerals and roman to arabic.


## Code Quality and Coverage

- `CircleCI` to build and test all master commits
- 100% test coverage enforcement at build time using `JaCoCo`
- Static analysis using `FindBugs` and `PMD`


## How to Run

```bash
git clone <this-repo>; cd <this-repo>
./gradlew clean build
```

## Generated Reports

| Name     | Path                                          |
| -------- |:---------------------------------------------:|
| JaCoCo   | `./build/reports/jacoco/test/html/index.html` |
| FindBugs | `./build/reports/findbugs/*`                  |
| PMD      | `./build/reports/pmd/*`                       |
| JUnit    | `./build/reports/tests/test/index.html`       |
