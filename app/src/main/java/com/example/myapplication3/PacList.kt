package com.example.myapplication3

class PacList<T> (
    private val ListName: T,
    var list:ArrayList<Pacient>
){
    fun Search_FIO (fio: String): PacList<String> {
        var result = PacList<String>("Подсписок ${ListName}(поиск по ФИО)", ArrayList())
        for(i in list){
            val matchResult = Regex(fio).find(i.FIO)
            if(matchResult != null)
                result.list.add(i)
        }
        return result
    }
    fun Search_Diagnosis (diag: String): PacList<String> {
        var result = PacList<String>("Подсписок ${ListName}(поиск по диагнозу)", ArrayList())
        for(i in list){
            val matchResult = Regex(diag).find(i.Diagnosis)
            if(matchResult != null)
                result.list.add(i)
        }
        return result
    }
    fun Search_City (city: String): PacList<String> {
        var result = PacList<String>("Подсписок ${ListName}(Поиск по городу)", ArrayList());
        for(i in list){
            if(i.City == city)
                result.list.add(i)
        }
        return result
    }
    fun Search_Retirees (thisyear: UInt, city: String): PacList<String> {
        val result0 = Search_City(city)
        var result = PacList<String>("Подсписок ${ListName}(поиск пенсионеров по городу)", ArrayList());
        for(i in result0.list){
            if(thisyear - i.Birth > 65u){
                result.list.add(i)
            }
        }
        return result
    }
    fun Sort_FIO (): PacList<T>{
        val sortedPeople = list.sortedWith(compareBy{ it.FIO })
        var result = PacList<T>(ListName, ArrayList());
        for(i in sortedPeople){
            result.list.add(i)
        }
        return result
    }

    override fun toString(): String {
        var result = "\nСписок — ${ListName}:\n"
        for(i in list){
            result += i.toString() + "\n"
        }
        return result
    }
}