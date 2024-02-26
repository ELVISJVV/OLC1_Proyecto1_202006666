
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package compiler;

import java_cup.runtime.*;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\006\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\004\000\002\006\012\000" +
    "\002\007\005\000\002\007\003\000\002\010\015\000\002" +
    "\012\020\000\002\013\005\000\002\013\003\000\002\011" +
    "\005\000\002\011\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\010\000\002\005\010\000" +
    "\002\005\010\000\002\005\010\000\002\005\010" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\004\004\004\001\002\000\012\003\015\006" +
    "\010\023\011\026\014\001\002\000\004\002\006\001\002" +
    "\000\004\002\001\001\002\000\014\003\ufffd\005\ufffd\006" +
    "\ufffd\023\ufffd\026\ufffd\001\002\000\004\036\123\001\002" +
    "\000\004\036\111\001\002\000\014\003\ufffe\005\ufffe\006" +
    "\ufffe\023\ufffe\026\ufffe\001\002\000\014\003\ufffc\005\ufffc" +
    "\006\ufffc\023\ufffc\026\ufffc\001\002\000\004\036\024\001" +
    "\002\000\004\032\023\001\002\000\014\003\015\005\021" +
    "\006\010\023\011\026\014\001\002\000\014\003\ufffb\005" +
    "\ufffb\006\ufffb\023\ufffb\026\ufffb\001\002\000\014\003\uffff" +
    "\005\uffff\006\uffff\023\uffff\026\uffff\001\002\000\004\004" +
    "\022\001\002\000\004\002\000\001\002\000\014\003\ufffa" +
    "\005\ufffa\006\ufffa\023\ufffa\026\ufffa\001\002\000\006\024" +
    "\026\025\025\001\002\000\004\036\ufff1\001\002\000\004" +
    "\033\107\001\002\000\004\036\030\001\002\000\004\036" +
    "\031\001\002\000\004\040\032\001\002\000\004\051\033" +
    "\001\002\000\004\044\034\001\002\000\004\042\035\001" +
    "\002\000\004\033\036\001\002\000\022\007\047\010\046" +
    "\011\042\012\040\013\050\047\043\050\037\051\045\001" +
    "\002\000\012\005\uffef\030\uffef\034\uffef\035\uffef\001\002" +
    "\000\004\031\102\001\002\000\006\034\076\035\075\001" +
    "\002\000\004\031\070\001\002\000\012\005\ufff0\030\ufff0" +
    "\034\ufff0\035\ufff0\001\002\000\006\034\ufff3\035\ufff3\001" +
    "\002\000\012\005\uffee\030\uffee\034\uffee\035\uffee\001\002" +
    "\000\004\031\063\001\002\000\004\031\056\001\002\000" +
    "\004\031\051\001\002\000\022\007\047\010\046\011\042" +
    "\012\040\013\050\047\043\050\037\051\045\001\002\000" +
    "\004\035\053\001\002\000\022\007\047\010\046\011\042" +
    "\012\040\013\050\047\043\050\037\051\045\001\002\000" +
    "\004\030\055\001\002\000\012\005\uffe9\030\uffe9\034\uffe9" +
    "\035\uffe9\001\002\000\022\007\047\010\046\011\042\012" +
    "\040\013\050\047\043\050\037\051\045\001\002\000\004" +
    "\035\060\001\002\000\022\007\047\010\046\011\042\012" +
    "\040\013\050\047\043\050\037\051\045\001\002\000\004" +
    "\030\062\001\002\000\012\005\uffea\030\uffea\034\uffea\035" +
    "\uffea\001\002\000\022\007\047\010\046\011\042\012\040" +
    "\013\050\047\043\050\037\051\045\001\002\000\004\035" +
    "\065\001\002\000\022\007\047\010\046\011\042\012\040" +
    "\013\050\047\043\050\037\051\045\001\002\000\004\030" +
    "\067\001\002\000\012\005\uffed\030\uffed\034\uffed\035\uffed" +
    "\001\002\000\022\007\047\010\046\011\042\012\040\013" +
    "\050\047\043\050\037\051\045\001\002\000\004\035\072" +
    "\001\002\000\022\007\047\010\046\011\042\012\040\013" +
    "\050\047\043\050\037\051\045\001\002\000\004\030\074" +
    "\001\002\000\012\005\uffec\030\uffec\034\uffec\035\uffec\001" +
    "\002\000\022\007\047\010\046\011\042\012\040\013\050" +
    "\047\043\050\037\051\045\001\002\000\004\005\077\001" +
    "\002\000\004\032\100\001\002\000\014\003\ufff5\005\ufff5" +
    "\006\ufff5\023\ufff5\026\ufff5\001\002\000\006\034\ufff4\035" +
    "\ufff4\001\002\000\022\007\047\010\046\011\042\012\040" +
    "\013\050\047\043\050\037\051\045\001\002\000\004\035" +
    "\104\001\002\000\022\007\047\010\046\011\042\012\040" +
    "\013\050\047\043\050\037\051\045\001\002\000\004\030" +
    "\106\001\002\000\012\005\uffeb\030\uffeb\034\uffeb\035\uffeb" +
    "\001\002\000\004\034\110\001\002\000\004\036\ufff2\001" +
    "\002\000\004\036\112\001\002\000\004\022\113\001\002" +
    "\000\004\043\114\001\002\000\022\007\047\010\046\011" +
    "\042\012\040\013\050\047\043\050\037\051\045\001\002" +
    "\000\006\005\120\035\117\001\002\000\006\005\ufff7\035" +
    "\ufff7\001\002\000\022\007\047\010\046\011\042\012\040" +
    "\013\050\047\043\050\037\051\045\001\002\000\004\032" +
    "\121\001\002\000\014\003\ufff9\005\ufff9\006\ufff9\023\ufff9" +
    "\026\ufff9\001\002\000\006\005\ufff8\035\ufff8\001\002\000" +
    "\006\024\026\025\025\001\002\000\004\036\125\001\002" +
    "\000\004\036\126\001\002\000\004\051\127\001\002\000" +
    "\004\044\130\001\002\000\004\042\131\001\002\000\022" +
    "\007\047\010\046\011\042\012\040\013\050\047\043\050" +
    "\037\051\045\001\002\000\004\005\133\001\002\000\004" +
    "\032\134\001\002\000\014\003\ufff6\005\ufff6\006\ufff6\023" +
    "\ufff6\026\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\132\000\004\002\004\001\001\000\014\003\015\004" +
    "\011\006\006\010\012\012\016\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\004\017\006\006\010" +
    "\012\012\016\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\005\043\013\040\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\051\001\001\000\002\001\001\000\004\005\053\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\056" +
    "\001\001\000\002\001\001\000\004\005\060\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\063\001\001" +
    "\000\002\001\001\000\004\005\065\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\070\001\001\000\002" +
    "\001\001\000\004\005\072\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\100\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\102\001\001\000\002\001\001\000\004\005\104" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\005\115\007\114\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\121\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\123\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\131\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado = "";

    public void syntax_error(Symbol s)
    {
            main.Main.listaErrores.add(new utilities.ErrorClass("Sintáctico", (String) s.value, s.right, s.left ));
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Recuperado" );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
            main.Main.listaErrores.add(new utilities.ErrorClass("Sintáctico", (String) s.value, s.right, s.left ));
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Sin recuperacion." );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {

  
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= RPROGRAM listainstr REND RPROGRAM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // listainstr ::= listainstr instruccion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listainstr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // listainstr ::= instruccion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listainstr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= print 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= declararVariable 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= declararArreglo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= error PYC 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // print ::= RCONSOLE DOSPUNTOS DOSPUNTOS RPRINT IGUAL printlist REND PYC 
            {
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 utilities.Instruction.print(exp.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("print",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // printlist ::= printlist COMA expresion 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = izq.toString() + ", " + der.toString();
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("printlist",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // printlist ::= expresion 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = val.toString(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("printlist",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // declararVariable ::= RVAR DOSPUNTOS tipoDato DOSPUNTOS DOSPUNTOS ID MENOR MENOS expresion REND PYC 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		RESULT = val.toString();
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declararVariable",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // declararArreglo ::= RARRAY DOSPUNTOS tipoDato DOSPUNTOS DOSPUNTOS ARROBA ID MENOR MENOS CORCHIZQ listaArray CORCHDER REND PYC 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		
//RESULT = val.toString();

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declararArreglo",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-13)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // listaArray ::= listaArray COMA expresion 
            {
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
//LinkedList<String> lista = (LinkedList<String>) listexp;
//lista.add(exp.toString());
//RESULT = lista;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listaArray",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // listaArray ::= expresion 
            {
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
//            LinkedList<String> lista = new LinkedList<>();
//            lista.add(exp.toString());
//            RESULT = lista;
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listaArray",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tipoDato ::= RCHAR CORCHIZQ CORCHDER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipoDato",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // tipoDato ::= RDOUBLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipoDato",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= DOUBLE 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = val.toString(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= CADENA 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = val.toString(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= ID 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = val.toString(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= RSUM PARIZQ expresion COMA expresion PARDER 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = utilities.Expression.Suma(izq.toString(),der.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= RMUL PARIZQ expresion COMA expresion PARDER 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = utilities.Expression.Multiplicacion(izq.toString(),der.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= RDIV PARIZQ expresion COMA expresion PARDER 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = utilities.Expression.Division(izq.toString(),der.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= RRES PARIZQ expresion COMA expresion PARDER 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = utilities.Expression.Resta(izq.toString(),der.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion ::= RMOD PARIZQ expresion COMA expresion PARDER 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = utilities.Expression.Modulo(izq.toString(),der.toString()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
