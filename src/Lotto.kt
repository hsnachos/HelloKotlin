import java.util.*

fun makeLotto():TreeSet<Int>{
    val lottoTreeSet:TreeSet<Int> = TreeSet()
    val random = Random()

    while(lottoTreeSet.size < 7){
        lottoTreeSet.add(random.nextInt(45)+1)
    }
    return lottoTreeSet
} // 로또번호 묶음 생성함수


fun main(){
    println("출력할 로또번호 개수를 입력하세요. (1부터 5사이)")
    val inputNum = Scanner(System.`in`).nextInt()
    val lottoList:LinkedList<TreeSet<Int>> = LinkedList()

    if(inputNum in 1..5){
        for(i in 0 until inputNum) lottoList.add(makeLotto())
    } else{
        println("1부터 5사이의 수를 입력해주세요.")
        return
    }

    for(i in 0 until lottoList.size) println(lottoList[i])
}