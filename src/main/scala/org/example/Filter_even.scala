package org.example
import org.apache.spark.{SparkConf, SparkContext}
object Filter_even {
    def main(args: Array[String]): Unit = {
      val conf = new SparkConf()
      conf.setMaster("local")
      conf.setAppName("untitled2")
      val sc = new SparkContext(conf)
      val rdd_7 = sc.parallelize( List(2,3,8,5,6,7) )
      val even=rdd_7.filter(_%2==0)
      even.foreach(println)

    }
}
