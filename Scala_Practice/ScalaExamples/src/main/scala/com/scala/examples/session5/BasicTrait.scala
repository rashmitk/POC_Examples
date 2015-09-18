package com.scala.examples.session5

trait AudioPlayer {
  def play
  def stop
}

trait AdvanceMusicPlayer extends AudioPlayer{
  def openTray
  def forwardTrack
  def enableDolbySound = println("Enable Dolby Sound")
}

trait Performer {
  def sing(song : String)
  def dance(danceStyle : String)
}

class DVDPlayer extends AdvanceMusicPlayer with AudioPlayer{
  override def play = println("Play music")
  override def stop = println("Stop music")
  override def openTray = println("Open tray")
  override def forwardTrack = println("Forward Track")
  override def enableDolbySound = println("Dolby with Surround sound")
  //You can override and extends dolbySound here
}

class Contestant extends DVDPlayer with Performer with AdvanceMusicPlayer with AudioPlayer{
   override def sing (song : String) = println("Singing "+ song) 
   override def dance(danceStyle : String) = println("Dancing style - "+danceStyle)
}


object Client1 extends App{
  val obj = new Contestant
  
  obj.play
  obj.enableDolbySound
  
  obj.sing("Waka Waka")
  obj.dance("Hiphop")
  
  
  obj.stop
  
}
