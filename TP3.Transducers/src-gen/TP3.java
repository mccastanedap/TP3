// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/TP3.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class TP3 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=5;
      Object lexer=$fix(TP3.createTransducer());
      $line=6;
      TP3.testLexer($cast(gold.structures.automaton.ITransducer.class,lexer));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP3.class,"main",$line);
    }
  }
  public static Object testLexer(ITransducer M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=12;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=14;
      while (true) {
        if (!($bool(true))) break;
        $line=15;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=16;
        System.out.println($message(new Object[]{"Enter an input string: "}));
        $line=17;
        Object string=$fix("");
        $line=18;
        Object cond=$fix(true);
        $line=19;
        while (true) {
          if (!($opEqualY(cond,true))) break;
          $line=20;
          Object a=$fix($invokeMethod("toString",((java.util.Scanner)sc).nextLine(),new Object[]{}));
          $line=21;
          if ($bool(!$opEqualY(a,""))) {
            $line=22;
            string=$fix($opAdditY($opAdditY(string,a)," "));
          }
          else {
            $line=24;
            cond=$fix(false);
            $line=25;
            System.out.println($message(new Object[]{string}));
          }
        }
        $line=29;
        Object result=$fix(((gold.structures.automaton.ITransducer)M).acceptsString($cast(java.lang.String.class,string)));
        $line=30;
        Object tokenStream=$fix(((gold.structures.automaton.ITransducer)M).getOutputString());
        $line=31;
        System.out.println($message(new Object[]{$opAdditY($opAdditY("The lexer did ",(($bool(result))?(""):("not ")))," accept the string.")}));
        $line=32;
        if ($bool(result)) {
          $line=32;
          System.out.println($message(new Object[]{$opAdditY("Token Stream: ",tokenStream)}));
        }
      }
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP3.class,"testLexer",$line);
    }
    return $result;
  }
  public static Object names=null;
  public static ITransducer createTransducer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=44;
      Object Q=$fix($opUnionY(GCollections.asSet("I","K","E","o","f","s","S","T","P","q","R","N"),GCollections.asSet("error")));
      $line=46;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY($opIntvlY('A','Z'),$opIntvlY('a','z')),$opIntvlY('0','9')),GCollections.asSet('(',')',',','_',' ',';')));
      $line=47;
      Object Out=$fix(GCollections.asSet("Cla","Ext","obj","f","s","Pair","Sup","Th","M","R","N"));
      $line=48;
      Object q=$fix("Init");
      $line=49;
      Object F=$fix($opUnionY(GCollections.asSet("Init"),GCollections.asSet("ERROR")));
      $line=51;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q,F,new GMethod(TP3.class,"\u03B4"),new GMethod(TP3.class,"g"),new GMethod(TP3.class,"h")});
      if (true) break $try;
      $line=52;
      $rethrow(new RuntimeException("The function \"createTransducer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP3.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=55;
      if ($bool($opEqualY(q,"ERROR"))) {
        $line=55;
        $result="ERROR";
        if (true) break $try;
      }
      else {
        $line=56;
        if ($opMembrY(\u03C3,GCollections.asSet('(',')',' ','\n',',','\t',';'))) {
          $line=56;
          $result="Init";
          if (true) break $try;
        }
        else {
          $line=58;
          if (($bool(((((((((((($opEqualY(q,"Init")||$opEqualY(q,"K"))||$opEqualY(q,"E"))||$opEqualY(q,"o"))||$opEqualY(q,"f"))||$opEqualY(q,"s"))||$opEqualY(q,"S"))||$opEqualY(q,"T"))||$opEqualY(q,"P"))||$opEqualY(q,"q"))||$opEqualY(q,"R"))||$opEqualY(q,"N")))&&$opMembrY(\u03C3,GCollections.asSet('\n','\t',' ')))) {
            $line=60;
            $result="Init";
            if (true) break $try;
          }
          else {
            $line=64;
            $result="ERROR";
            if (true) break $try;
          }
        }
      }
      $line=68;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP3.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=73;
      $result="";
      if (true) break $try;
      $line=74;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP3.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=78;
      String s=null;
      s=$defaultValue(String.class);
      $line=79;
      s=$cast(String.class,$fix(""));
      $line=81;
      if ($opEqualY(q,"ERROR")) {
        $line=81;
        $result="$";
        if (true) break $try;
      }
      else {
        $line=82;
        if ($opEqualY(\u03C3,':')) {
          $line=82;
          $result=$invokeMethod(String.class,"valueOf",true,null,new Object[]{""});
          if (true) break $try;
        }
        else {
          $line=84;
          if ($opMembrY(\u03C3,GCollections.asSet(' ',',','\n','\t',';',':',' '))) {
            $line=85;
            if (!$opMembrY(\u03C3,GCollections.asSet(' ','\n','\t'))) {
              $line=85;
              s=$cast(String.class,$fix($invokeMethod(String.class,"valueOf",true,null,new Object[]{\u03C3})));
            }
            $line=89;
            if ($opEqualY(q,"Init")) {
              $line=89;
              $result=s;
              if (true) break $try;
            }
            else {
              $line=91;
              if ($opEqualY(q,"K")) {
                $line=91;
                $result="Cla";
                if (true) break $try;
              }
              else {
                $line=93;
                if ($opEqualY(q,"E")) {
                  $line=93;
                  $result="Ext";
                  if (true) break $try;
                }
                else {
                  $line=95;
                  if ($opEqualY(q,"o")) {
                    $line=95;
                    $result=$opAdditY("obj",s);
                    if (true) break $try;
                  }
                  else {
                    $line=97;
                    if ($opEqualY(q,"f")) {
                      $line=97;
                      $result=$opAdditY("f",s);
                      if (true) break $try;
                    }
                    else {
                      $line=99;
                      if ($opEqualY(q,"s")) {
                        $line=99;
                        $result=$opAdditY("s",s);
                        if (true) break $try;
                      }
                      else {
                        $line=101;
                        if ($opEqualY(q,"S")) {
                          $line=101;
                          $result=$opAdditY("Sup",s);
                          if (true) break $try;
                        }
                        else {
                          $line=103;
                          if ($opEqualY(q,"T")) {
                            $line=103;
                            $result=$opAdditY("Th",s);
                            if (true) break $try;
                          }
                          else {
                            $line=105;
                            if ($opEqualY(q,"P")) {
                              $line=105;
                              $result=$opAdditY("Pair",s);
                              if (true) break $try;
                            }
                            else {
                              $line=107;
                              if ($opEqualY(q,"q")) {
                                $line=107;
                                $result=$opAdditY("q",s);
                                if (true) break $try;
                              }
                              else {
                                $line=109;
                                if ($opEqualY(q,"N")) {
                                  $line=109;
                                  $result=$opAdditY("new",s);
                                  if (true) break $try;
                                }
                                else {
                                  $line=111;
                                  if ($opEqualY(q,"R")) {
                                    $line=111;
                                    $result="Return";
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=113;
                                    if ($opEqualY(q,"N")) {
                                      $line=113;
                                      $result=$opAdditY("new",s);
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=115;
                                      $result=$opAdditY("v",s);
                                      if (true) break $try;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else {
            $line=119;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=123;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP3.class,"h",$line);
    }
    return $result;
  }
}
