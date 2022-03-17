# java-blackjack

블랙잭 미션 저장소

## 기능 목록
- [x]  플레이어들의 이름을 입력한다.
    - [x]  이름은 쉼표로 구분한다.
    - [x]  플레이어는 중복된 이름을 가질 수 없다.
    - [x]  이름은 최소 1글자, 최대 6글자로 제한한다.
    - [x]  최소 1명 이상 최대 8명 이하로 입력해야한다.
- [x]  게임이 시작되면 카드를 2장씩 나눈다.
- [x]  딜러는 1장만 공개, 플레이어는 2장씩 공개한다.
- [x]  플레이어마다 카드를 더 받을지 입력한다.
    - [x]  플레이어가 카드를 받는다고 하는 경우, 카드를 한장 추가한다.
    - [x]  플레이어가 카드를 받지 않는다고 하는 경우, 다음 플레이어에게 물어본다.
    - [x]  플레이어가 카드 숫자의 합이 21 초과인 경우 해당 플레이어는 더이상 카드를 받을 수 없다. (패배)
    - [x]  모든 플레이어의 순서가 끝나면 딜러차례로 넘어간다.
- [x]  딜러의 카드숫자의 합이 17 이상이 될 때까지 카드를 한 장씩 받는다.
- [x]  A 카드는 1과 11 중 가장 이득이 되는 경우로 계산한다.
- [x]  최종 결과를 출력한다.
    - [x]  받은 카드를 모두 출력하고, 카드 숫자의 합을 출력한다.
- [x]  최종 승패를 판단한다.
    - [x]  딜러는 모든 플레이어에 대해 승/패/무승부 결과를 판단한다.
    - [x]  각 플레이어는 딜러의 카드 합과 비교하여 승/패/무승부 결과를 판단한다.
       - [x]  카드 숫자의 합이 21인 경우 플레이어는 무조건 패배한다.
       - [x]  플레이어의 숫자 합이 딜러의 숫자 합보다 크면 승리한다.
       - [x]  플레이어의 숫자 합이 딜러의 숫자 합보다 작으면 패배한다.
       - [x]  플레이어의 숫자 합과 딜러의 숫자 합과 같으면 비긴다.
- [ ]  플레이어는 게임을 시작할 때 베팅 금액을 정해야 한다.
- [ ]  게임에서 승리하면 베팅금액에 해당하는 금액을 돌려받는다.
     - [x]  처음 두 장의 카드 합이 21일 경우 블랙잭이 된다.
     - [ ]  블랙잭이 되면 베팅 금액의 1.5배를 딜러에게 받는다.
 
## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
