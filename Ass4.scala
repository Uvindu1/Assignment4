package CaesarCipher

object Ass4 {
   def main(args:Array[String])
{
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
    
    val s=scala.io.StdIn.readLine("Shift By: ")
    
    val shift=(s.toInt+alphabet.size)% alphabet.size
    
    val Input=scala.io.StdIn.readLine("Message that want to send: ")
    
    println("")
    
    val Output=Input.map((a: Char) => {
    
    val p=alphabet.indexOf(a.toUpper)
    
    if(p == -1)
    {
      a
    }
    else
    {
     alphabet((p + shift) % alphabet.size)
    }
    });
    
    println("The Text that encrypt: "+Output)
    
    val text=Output.map((a: Char) => {
    
    val p=alphabet.indexOf(a.toUpper)
    
    if(p == -1)
    {
      a
    }
    else
    {
     alphabet((p - shift) % alphabet.size)
    }
    });
    
    println("The text that is encrypt: "+text)
}
 
}