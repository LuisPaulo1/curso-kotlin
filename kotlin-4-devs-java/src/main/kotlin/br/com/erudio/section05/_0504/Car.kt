package br.com.erudio.section05._0504

class Car : Vehicle {

    override val automakerName = "Honda"
    override fun getDoors(): Int {
      return 5
    }
    //override fun getDoors() = 5
}