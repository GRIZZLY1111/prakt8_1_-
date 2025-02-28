fun main()
{
    try
    {
        val bob: Student = Student()
        bob.Infa()
        var j =2
        var i=1
        while(i<j) {
            println("Хотите ли изменить данные нажмите 0 для нет нажмите 1 если хотите изменить все данные и нажмите 2 если хотите изменить что-то конкретное " +
                    "и нажмите 3 если хотите вывести информацию о студенте")
            var x = readln().toInt()
            when (x) {
                0 -> {
                    println("Конец программы")
                    i+=1
                }
                1 -> {
                    bob.Izmenenia()
                }
                2 -> {
                    Izmenenie(x)
                }
                3 ->{
                    bob.Infa()
                    bob.srrost()
                }
                else -> {
                    println("Такого варианта ответа не существует")
                }
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}