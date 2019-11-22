/* The following code was generated by JFlex 1.4.3 on 11/19/19 7:28 p.m. */

package codigo;
import static codigo.token.*;

/* SECCION DE DECLARACIONES DE JFLEX */ 

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/19/19 7:28 p.m. from the specification file
 * <tt>C:/Users/criss/OneDrive/Documentos/NetBeansProjects/AnalizadorLexicoLPG/src/codigo/lexer.flex</tt>
 */
class lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\6\2\0\1\4\22\0\1\4\1\16\1\7\2\0"+
    "\1\13\1\15\1\0\1\21\1\22\1\12\1\10\1\4\1\11\1\31"+
    "\1\5\2\3\1\103\7\3\1\27\1\30\1\17\1\20\1\17\2\0"+
    "\1\72\1\62\1\63\1\46\1\67\1\101\1\47\1\1\1\77\2\1"+
    "\1\45\1\64\1\1\1\75\1\65\1\1\1\102\1\61\1\71\1\1"+
    "\1\66\4\1\1\23\1\0\1\24\1\0\1\60\1\0\1\41\1\52"+
    "\1\34\1\51\1\56\1\43\1\40\1\55\1\32\1\54\1\2\1\57"+
    "\1\42\1\33\1\35\1\36\1\2\1\37\1\50\1\44\1\53\1\76"+
    "\1\2\1\74\1\73\1\70\1\25\1\14\1\26\163\0\1\100\uff0e\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\4\5\2\1\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\10\2\1\1\5\2"+
    "\1\0\1\4\1\23\1\24\1\10\1\11\1\0\1\25"+
    "\15\2\2\0\1\26\5\2\1\3\1\0\4\2\1\26"+
    "\11\2\14\0\5\2\1\3\16\2\1\26\33\0\14\2"+
    "\40\0\1\26\5\0\2\2\1\26\7\2\30\0\1\26"+
    "\15\0\10\2\3\0\1\26\40\0\5\2\36\0\4\2"+
    "\36\0\4\2\24\0\2\2\3\0\1\26\16\0\2\2"+
    "\15\0\2\2\12\0\1\2\10\0\1\26\25\0\1\26"+
    "\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[460];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\104\0\104"+
    "\0\u0198\0\u01dc\0\u0220\0\104\0\u0264\0\u02a8\0\u02ec\0\u02ec"+
    "\0\u02ec\0\u0330\0\104\0\104\0\104\0\104\0\104\0\u0374"+
    "\0\104\0\u03b8\0\u03fc\0\u0440\0\u0484\0\u04c8\0\u050c\0\u0550"+
    "\0\u0594\0\u05d8\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c\0\u0770"+
    "\0\u07b4\0\104\0\104\0\104\0\104\0\u07f8\0\104\0\u083c"+
    "\0\u0880\0\u08c4\0\u0908\0\u094c\0\u0990\0\u09d4\0\u0a18\0\u0a5c"+
    "\0\u0aa0\0\u0ae4\0\u0b28\0\u0b6c\0\u0bb0\0\u0bf4\0\u0c38\0\u0c7c"+
    "\0\u0cc0\0\u0d04\0\u0d48\0\u0d8c\0\u0770\0\u0dd0\0\u0e14\0\u0e58"+
    "\0\u0e9c\0\u0ee0\0\210\0\u0f24\0\u0f68\0\u0fac\0\u0ff0\0\u1034"+
    "\0\u1078\0\u10bc\0\u1100\0\u1144\0\u1188\0\u11cc\0\u1210\0\u1254"+
    "\0\u1298\0\u12dc\0\u1320\0\u1364\0\u13a8\0\u13ec\0\u1430\0\u1474"+
    "\0\u14b8\0\u14fc\0\u1540\0\u1584\0\u15c8\0\104\0\u160c\0\u1650"+
    "\0\u1694\0\u16d8\0\u171c\0\u1760\0\u17a4\0\u17e8\0\u182c\0\u1870"+
    "\0\u18b4\0\u18f8\0\u193c\0\u1980\0\u19c4\0\u1a08\0\u1a4c\0\u1a90"+
    "\0\u1ad4\0\u1b18\0\u1b5c\0\u1ba0\0\u1be4\0\u1c28\0\u1c6c\0\u1cb0"+
    "\0\u1cf4\0\u1d38\0\u1d7c\0\u1dc0\0\u1e04\0\u1e48\0\u1e8c\0\u1ed0"+
    "\0\u1f14\0\u1f58\0\u1f9c\0\u1fe0\0\u2024\0\u2068\0\u20ac\0\u20f0"+
    "\0\u2134\0\u2178\0\u21bc\0\u2200\0\u2244\0\u2288\0\u22cc\0\u2310"+
    "\0\u2354\0\u2398\0\u23dc\0\u2420\0\u2464\0\u24a8\0\u24ec\0\u2530"+
    "\0\u2574\0\u25b8\0\u25fc\0\u2640\0\u2684\0\u26c8\0\u270c\0\u2750"+
    "\0\u2794\0\u27d8\0\u281c\0\u2860\0\u28a4\0\u28e8\0\u292c\0\u2970"+
    "\0\u29b4\0\u29f8\0\u2a3c\0\u2a80\0\u2ac4\0\u2b08\0\u2b4c\0\u2b90"+
    "\0\u2bd4\0\u2c18\0\u2c5c\0\u2ca0\0\u2ce4\0\u2d28\0\u2d6c\0\u2db0"+
    "\0\u2df4\0\u2e38\0\u2e7c\0\u2ec0\0\u2f04\0\u2f48\0\u2f8c\0\u2fd0"+
    "\0\u3014\0\u3058\0\u309c\0\u30e0\0\u3124\0\u3168\0\u31ac\0\u31f0"+
    "\0\u3234\0\u3278\0\u32bc\0\u3300\0\u3344\0\u3388\0\u33cc\0\u3410"+
    "\0\u3454\0\u3498\0\u34dc\0\u3520\0\u3564\0\u35a8\0\u35ec\0\u3630"+
    "\0\u3674\0\u36b8\0\u36fc\0\u3740\0\u3784\0\u37c8\0\u380c\0\u3850"+
    "\0\u3894\0\u38d8\0\u391c\0\u3960\0\u39a4\0\u39e8\0\u3a2c\0\u3a70"+
    "\0\u3ab4\0\u3af8\0\u3b3c\0\u3b80\0\u3bc4\0\u3c08\0\u3c4c\0\u3c90"+
    "\0\u3cd4\0\u3d18\0\u3d5c\0\u3da0\0\u3de4\0\104\0\u3e28\0\u3e6c"+
    "\0\u3eb0\0\u3ef4\0\u3f38\0\u3f7c\0\u3fc0\0\u4004\0\u4048\0\u408c"+
    "\0\u40d0\0\u4114\0\u4158\0\u419c\0\u41e0\0\u4224\0\u4268\0\u42ac"+
    "\0\u42f0\0\u4334\0\u4378\0\u43bc\0\u4400\0\u4444\0\u4488\0\u44cc"+
    "\0\u4510\0\u4554\0\u4598\0\u45dc\0\u4620\0\u4664\0\u46a8\0\u46ec"+
    "\0\u4730\0\u4774\0\u47b8\0\u47fc\0\u4840\0\u4884\0\u48c8\0\u490c"+
    "\0\u4950\0\u4994\0\u49d8\0\u4a1c\0\u4a60\0\u4aa4\0\u4ae8\0\u4b2c"+
    "\0\u4b70\0\u4bb4\0\u4bf8\0\u4c3c\0\u4c80\0\u4cc4\0\u4d08\0\u4d4c"+
    "\0\u4d90\0\u4dd4\0\u4e18\0\u4e5c\0\u4ea0\0\u4ee4\0\u4f28\0\u4f6c"+
    "\0\u4fb0\0\u4ff4\0\u5038\0\u507c\0\u50c0\0\u5104\0\u5148\0\u518c"+
    "\0\u51d0\0\u5214\0\u5258\0\u529c\0\u52e0\0\u5324\0\u5368\0\u53ac"+
    "\0\u53f0\0\u5434\0\u5478\0\u54bc\0\u5500\0\u5544\0\u5588\0\u55cc"+
    "\0\u5610\0\u5654\0\u5698\0\u56dc\0\u5720\0\u5764\0\u57a8\0\u57ec"+
    "\0\u5830\0\u5874\0\u58b8\0\u58fc\0\u5940\0\u5984\0\u59c8\0\u5a0c"+
    "\0\u5a50\0\u5a94\0\u5ad8\0\u5b1c\0\u5b60\0\u5ba4\0\u5be8\0\u5c2c"+
    "\0\u5c70\0\u5cb4\0\u5cf8\0\u5d3c\0\u5d80\0\u5dc4\0\u5e08\0\u5e4c"+
    "\0\u5e90\0\u5ed4\0\u5f18\0\u5f5c\0\u5fa0\0\u5fe4\0\u6028\0\u606c"+
    "\0\u60b0\0\u60f4\0\u6138\0\u617c\0\u61c0\0\u6204\0\u6248\0\u628c"+
    "\0\u62d0\0\u6314\0\u6358\0\u639c\0\u63e0\0\u6424\0\u6468\0\u64ac"+
    "\0\u64f0\0\u6534\0\u6578\0\u65bc\0\u6600\0\u6644\0\u6688\0\u66cc"+
    "\0\u6710\0\u6754\0\u6798\0\u67dc\0\u6820\0\u6864\0\u68a8\0\u68ec"+
    "\0\u6930\0\u6974\0\u69b8\0\u69fc\0\u6a40\0\u6a84\0\u6ac8\0\u6b0c"+
    "\0\u6b50\0\u6b94\0\u6bd8\0\u6c1c\0\u6c60\0\u6ca4\0\u6ce8\0\u6d2c"+
    "\0\u6d70\0\u6db4\0\u6df8\0\u6e3c\0\u6e80\0\u6ec4\0\u6f08\0\u6f4c"+
    "\0\u6f90\0\u6fd4\0\u7018\0\u705c\0\u70a0\0\u70e4\0\u7128\0\u716c"+
    "\0\u71b0\0\u71f4\0\u7238\0\u727c\0\u72c0\0\u7304\0\u7348\0\u738c"+
    "\0\u73d0\0\u7414\0\u7458\0\u749c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[460];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\2\1\32\1\33\1\34\1\35\1\36\2\3\1\37"+
    "\1\40\1\41\1\3\1\42\2\2\1\43\1\44\1\45"+
    "\2\3\1\46\1\47\1\3\10\2\1\3\2\2\2\3"+
    "\1\2\1\3\4\2\1\4\105\0\3\3\26\0\46\3"+
    "\1\0\3\3\3\0\1\4\25\0\1\50\51\0\1\4"+
    "\4\0\1\5\104\0\1\51\106\0\1\52\104\0\1\53"+
    "\104\0\1\14\105\0\1\54\104\0\1\54\106\0\1\55"+
    "\74\0\1\56\112\0\1\57\64\0\3\3\26\0\1\3"+
    "\1\60\6\3\1\61\35\3\1\0\3\3\1\0\3\3"+
    "\26\0\21\3\1\62\24\3\1\0\3\3\1\0\3\3"+
    "\26\0\3\3\1\63\3\3\1\64\36\3\1\0\3\3"+
    "\1\0\3\3\26\0\5\3\1\65\12\3\1\66\25\3"+
    "\1\0\3\3\1\0\3\3\26\0\5\3\1\67\17\3"+
    "\1\70\20\3\1\0\3\3\1\0\3\3\26\0\2\3"+
    "\1\71\43\3\1\0\3\3\1\0\3\3\26\0\1\72"+
    "\2\3\1\73\42\3\1\0\3\3\1\0\3\3\26\0"+
    "\1\74\45\3\1\0\3\3\45\0\1\75\1\0\1\76"+
    "\35\0\3\3\26\0\1\77\45\3\1\0\3\3\1\0"+
    "\3\3\26\0\1\100\45\3\1\0\3\3\1\0\3\3"+
    "\26\0\3\3\1\101\42\3\1\0\3\3\1\0\3\3"+
    "\26\0\7\3\1\102\36\3\1\0\3\3\1\0\3\3"+
    "\26\0\1\3\1\103\23\3\1\104\20\3\1\0\3\3"+
    "\3\0\1\105\77\0\1\105\6\51\1\0\75\51\3\0"+
    "\1\106\77\0\1\106\1\0\3\3\26\0\1\107\45\3"+
    "\1\0\3\3\1\0\3\3\26\0\4\3\1\110\41\3"+
    "\1\0\3\3\1\0\3\3\26\0\10\3\1\111\35\3"+
    "\1\0\3\3\1\0\3\3\26\0\25\3\1\112\20\3"+
    "\1\0\3\3\1\0\3\3\26\0\17\3\1\113\26\3"+
    "\1\0\3\3\1\0\3\3\26\0\17\3\1\114\26\3"+
    "\1\0\3\3\1\0\3\3\26\0\12\3\1\115\33\3"+
    "\1\0\3\3\1\0\3\3\26\0\3\3\1\116\42\3"+
    "\1\0\3\3\1\0\3\3\26\0\7\3\1\117\36\3"+
    "\1\0\3\3\1\0\3\3\26\0\21\3\1\120\24\3"+
    "\1\0\3\3\1\0\3\3\26\0\24\3\1\121\21\3"+
    "\1\0\3\3\1\0\3\3\26\0\1\3\1\122\14\3"+
    "\1\123\1\124\26\3\1\0\3\3\1\0\3\3\26\0"+
    "\1\3\1\113\44\3\1\0\3\3\46\0\1\125\74\0"+
    "\1\126\5\0\1\127\11\0\1\130\1\131\2\0\1\132"+
    "\1\133\1\134\1\135\1\136\1\0\1\137\10\0\1\140"+
    "\2\0\3\3\26\0\1\3\1\141\44\3\1\0\3\3"+
    "\1\0\3\3\26\0\20\3\1\142\25\3\1\0\3\3"+
    "\1\0\3\3\26\0\3\3\1\143\42\3\1\0\3\3"+
    "\1\0\3\3\26\0\2\3\1\144\43\3\1\0\3\3"+
    "\1\0\3\3\26\0\12\3\1\113\33\3\1\0\3\3"+
    "\1\0\3\3\26\0\24\3\1\145\21\3\1\0\3\3"+
    "\3\0\1\106\16\0\1\146\60\0\1\106\1\0\3\3"+
    "\26\0\2\3\1\147\43\3\1\0\3\3\1\0\3\3"+
    "\26\0\5\3\1\150\40\3\1\0\3\3\1\0\3\3"+
    "\26\0\14\3\1\151\31\3\1\0\3\3\1\0\3\3"+
    "\26\0\3\3\1\152\42\3\1\0\3\3\1\0\3\3"+
    "\26\0\24\3\1\153\21\3\1\0\3\3\1\0\3\3"+
    "\26\0\24\3\1\154\21\3\1\0\3\3\1\0\3\3"+
    "\26\0\6\3\1\155\2\3\1\156\34\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\3\1\157\44\3\1\0\3\3"+
    "\1\0\3\3\26\0\10\3\1\160\35\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\3\1\161\44\3\1\0\3\3"+
    "\1\0\3\3\26\0\12\3\1\162\33\3\1\0\3\3"+
    "\1\0\3\3\26\0\12\3\1\163\33\3\1\0\3\3"+
    "\1\0\3\3\26\0\24\3\1\164\21\3\1\0\3\3"+
    "\47\0\1\165\71\0\1\166\107\0\1\167\74\0\1\170"+
    "\116\0\1\171\1\172\12\0\1\173\1\0\1\174\1\175"+
    "\1\176\1\177\1\200\1\0\1\201\1\202\4\0\1\203"+
    "\2\0\1\204\36\0\1\205\1\0\1\206\101\0\1\207"+
    "\3\0\1\210\77\0\1\211\103\0\1\212\20\0\1\213"+
    "\67\0\1\214\11\0\1\215\70\0\1\216\14\0\1\217"+
    "\103\0\1\220\26\0\3\3\26\0\3\3\1\113\42\3"+
    "\1\0\3\3\1\0\3\3\26\0\21\3\1\221\24\3"+
    "\1\0\3\3\1\0\3\3\26\0\25\3\1\113\20\3"+
    "\1\0\3\3\1\0\3\3\26\0\24\3\1\222\21\3"+
    "\1\0\3\3\1\0\3\3\26\0\10\3\1\223\35\3"+
    "\1\0\3\3\1\0\3\3\26\0\1\141\45\3\1\0"+
    "\3\3\1\0\3\3\26\0\1\224\45\3\1\0\3\3"+
    "\1\0\3\3\26\0\24\3\1\225\21\3\1\0\3\3"+
    "\1\0\3\3\26\0\5\3\1\226\40\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\3\1\227\44\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\3\1\144\44\3\1\0\3\3"+
    "\1\0\3\3\26\0\5\3\1\230\40\3\1\0\3\3"+
    "\1\0\3\3\26\0\21\3\1\231\24\3\1\0\3\3"+
    "\1\0\3\3\26\0\12\3\1\232\33\3\1\0\3\3"+
    "\1\0\3\3\26\0\21\3\1\233\24\3\1\0\3\3"+
    "\1\0\3\3\26\0\12\3\1\234\33\3\1\0\3\3"+
    "\1\0\3\3\26\0\7\3\1\222\36\3\1\0\3\3"+
    "\1\0\3\3\26\0\5\3\1\162\40\3\1\0\3\3"+
    "\1\0\3\3\26\0\25\3\1\141\20\3\1\0\3\3"+
    "\34\0\1\235\2\0\1\236\16\0\1\237\71\0\1\240"+
    "\127\0\1\241\55\0\1\242\73\0\1\243\20\0\1\244"+
    "\65\0\1\245\103\0\1\246\103\0\1\205\15\0\1\247"+
    "\103\0\1\250\65\0\1\251\1\0\1\252\13\0\1\253"+
    "\3\0\1\254\56\0\1\255\121\0\1\256\72\0\1\257"+
    "\16\0\1\260\61\0\1\261\22\0\1\262\57\0\1\263"+
    "\117\0\1\264\113\0\1\265\102\0\1\266\75\0\1\267"+
    "\1\270\76\0\1\271\107\0\1\272\112\0\1\273\57\0"+
    "\1\274\3\0\1\275\102\0\1\276\123\0\1\277\67\0"+
    "\1\300\100\0\1\301\106\0\1\302\42\0\3\3\26\0"+
    "\22\3\1\162\23\3\1\0\3\3\1\0\3\3\26\0"+
    "\5\3\1\113\40\3\1\0\3\3\1\0\3\3\26\0"+
    "\24\3\1\303\21\3\1\0\3\3\1\0\3\3\26\0"+
    "\10\3\1\304\35\3\1\0\3\3\1\0\3\3\26\0"+
    "\2\3\1\305\43\3\1\0\3\3\1\0\3\3\26\0"+
    "\26\3\1\306\17\3\1\0\3\3\1\0\3\3\26\0"+
    "\26\3\1\307\17\3\1\0\3\3\1\0\3\3\26\0"+
    "\7\3\1\310\36\3\1\0\3\3\1\0\3\3\26\0"+
    "\1\3\1\311\44\3\1\0\3\3\1\0\3\3\26\0"+
    "\1\312\45\3\1\0\3\3\1\0\3\3\26\0\25\3"+
    "\1\313\20\3\1\0\3\3\1\0\3\3\26\0\5\3"+
    "\1\314\40\3\1\0\3\3\35\0\1\315\15\0\1\316"+
    "\106\0\1\317\75\0\1\320\74\0\1\321\77\0\1\322"+
    "\104\0\1\323\100\0\1\324\112\0\1\325\113\0\1\326"+
    "\110\0\1\327\65\0\1\330\120\0\1\331\104\0\1\332"+
    "\61\0\1\333\101\0\1\334\111\0\1\335\112\0\1\336"+
    "\77\0\1\337\71\0\1\340\145\0\1\341\62\0\1\342"+
    "\73\0\1\343\111\0\1\344\114\0\1\345\56\0\1\321"+
    "\107\0\1\346\106\0\1\347\74\0\1\350\105\0\1\351"+
    "\16\0\1\352\57\0\1\353\147\0\1\354\51\0\1\355"+
    "\103\0\1\344\115\0\1\356\61\0\1\357\110\0\1\360"+
    "\104\0\1\361\76\0\1\362\47\0\3\3\26\0\1\3"+
    "\1\363\44\3\1\0\3\3\1\0\3\3\26\0\1\222"+
    "\45\3\1\0\3\3\1\0\3\3\26\0\13\3\1\113"+
    "\32\3\1\0\3\3\1\0\3\3\26\0\30\3\1\364"+
    "\15\3\1\0\3\3\1\0\3\3\26\0\4\3\1\365"+
    "\41\3\1\0\3\3\1\0\3\3\26\0\10\3\1\366"+
    "\35\3\1\0\3\3\1\0\3\3\26\0\17\3\1\367"+
    "\26\3\1\0\3\3\1\0\3\3\26\0\25\3\1\370"+
    "\20\3\1\0\3\3\1\0\3\3\26\0\7\3\1\371"+
    "\36\3\1\0\3\3\1\0\3\3\26\0\7\3\1\372"+
    "\36\3\1\0\3\3\33\0\1\373\122\0\1\373\65\0"+
    "\1\374\112\0\1\375\77\0\1\376\131\0\1\377\50\0"+
    "\1\u0100\127\0\1\u0101\57\0\1\u0102\130\0\1\u0103\61\0"+
    "\1\376\117\0\1\u0104\102\0\1\u0105\65\0\1\u0106\114\0"+
    "\1\u0107\27\0\1\u0108\54\0\1\u0109\72\0\1\u010a\114\0"+
    "\1\u010b\115\0\1\u010c\66\0\1\u010d\106\0\1\u010e\101\0"+
    "\1\u010f\102\0\1\376\74\0\1\u0110\143\0\1\376\50\0"+
    "\1\u0111\103\0\1\u0112\130\0\1\u0113\1\u0114\1\u0115\47\0"+
    "\1\u0116\110\0\1\u0117\100\0\1\u0118\125\0\1\u0119\66\0"+
    "\1\u011a\132\0\1\240\66\0\1\u011b\130\0\1\u011c\35\0"+
    "\1\u011d\122\0\1\u011e\33\0\3\3\26\0\12\3\1\141"+
    "\33\3\1\0\3\3\1\0\3\3\26\0\21\3\1\u011f"+
    "\24\3\1\0\3\3\1\0\3\3\26\0\5\3\1\u0120"+
    "\40\3\1\0\3\3\1\0\3\3\26\0\7\3\1\113"+
    "\36\3\1\0\3\3\1\0\3\3\26\0\1\u0121\45\3"+
    "\1\0\3\3\1\0\3\3\26\0\25\3\1\u0122\20\3"+
    "\1\0\3\3\1\0\3\3\26\0\2\3\1\u0123\43\3"+
    "\1\0\3\3\1\0\3\3\26\0\16\3\1\113\27\3"+
    "\1\0\3\3\35\0\1\u0124\112\0\1\u0125\115\0\1\u0126"+
    "\64\0\1\u0127\105\0\1\u0128\103\0\1\u0129\75\0\1\u012a"+
    "\126\0\1\376\64\0\1\u012b\110\0\1\u012c\77\0\1\u012d"+
    "\116\0\1\u012e\106\0\1\u012f\62\0\1\u0130\112\0\1\u0131"+
    "\100\0\1\u0132\101\0\1\u0133\77\0\1\u0134\123\0\1\u0135"+
    "\103\0\1\u0136\64\0\1\u0103\135\0\1\u0137\56\0\1\u0138"+
    "\103\0\1\u0139\77\0\1\251\100\0\1\u013a\141\0\1\u013b"+
    "\45\0\1\u013c\103\0\1\u013d\110\0\1\u013e\77\0\1\343"+
    "\104\0\1\u013f\104\0\1\u0140\101\0\1\240\126\0\1\u0141"+
    "\26\0\3\3\26\0\11\3\1\u0142\34\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\u0143\45\3\1\0\3\3\1\0"+
    "\3\3\26\0\17\3\1\u0144\26\3\1\0\3\3\1\0"+
    "\3\3\26\0\7\3\1\226\36\3\1\0\3\3\1\0"+
    "\3\3\26\0\1\u0145\45\3\1\0\3\3\45\0\1\u0146"+
    "\13\0\1\u0147\63\0\1\u0148\101\0\1\u0149\76\0\1\u014a"+
    "\110\0\1\u014b\114\0\1\376\7\0\1\u014c\60\0\1\u014d"+
    "\107\0\1\u014e\101\0\1\u014f\101\0\1\u0150\101\0\1\u0151"+
    "\104\0\1\u0152\117\0\1\376\65\0\1\u0153\131\0\1\u0154"+
    "\101\0\1\327\65\0\1\u0155\102\0\1\343\123\0\1\u0156"+
    "\102\0\1\u0157\64\0\1\u0158\110\0\1\u0159\107\0\1\u015a"+
    "\120\0\1\u015b\7\0\1\u015c\1\0\1\u015d\45\0\1\u015e"+
    "\77\0\1\u015f\140\0\1\u0160\43\0\1\u0161\137\0\1\u0162"+
    "\74\0\1\u0163\25\0\3\3\26\0\11\3\1\u0164\34\3"+
    "\1\0\3\3\1\0\3\3\26\0\1\3\1\u0165\44\3"+
    "\1\0\3\3\1\0\3\3\26\0\7\3\1\u0166\36\3"+
    "\1\0\3\3\1\0\3\3\26\0\3\3\1\u0167\42\3"+
    "\1\0\3\3\32\0\1\u0168\106\0\1\u015e\101\0\1\u0124"+
    "\111\0\1\u0124\75\0\1\u0169\132\0\1\u016a\66\0\1\u0146"+
    "\15\0\1\u016b\70\0\1\343\104\0\1\u016c\110\0\1\u016d"+
    "\60\0\1\327\121\0\1\327\66\0\1\u016e\126\0\1\u016f"+
    "\110\0\1\u0170\72\0\1\u0171\71\0\1\u0152\75\0\1\274"+
    "\151\0\1\u0172\41\0\1\u0173\117\0\1\u0174\106\0\1\u0175"+
    "\64\0\1\u0176\115\0\1\u0177\111\0\1\376\57\0\1\u0140"+
    "\134\0\1\u0178\54\0\1\u0179\124\0\1\u017a\66\0\1\u017b"+
    "\43\0\3\3\26\0\24\3\1\u017c\21\3\1\0\3\3"+
    "\1\0\3\3\26\0\2\3\1\u017d\43\3\1\0\3\3"+
    "\1\0\3\3\26\0\17\3\1\226\26\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\3\1\226\44\3\1\0\3\3"+
    "\33\0\1\376\104\0\1\u017e\122\0\1\u017f\62\0\1\u0180"+
    "\106\0\1\u0181\103\0\1\u0182\100\0\1\u0183\130\0\1\343"+
    "\61\0\1\u0184\125\0\1\u0185\77\0\1\u0186\62\0\1\u0187"+
    "\112\0\1\u0188\101\0\1\u0189\110\0\1\u018a\115\0\1\u018b"+
    "\62\0\1\u018c\101\0\1\u018d\103\0\1\u018e\121\0\1\u018f"+
    "\33\0\3\3\26\0\5\3\1\u0190\40\3\1\0\3\3"+
    "\1\0\3\3\26\0\1\u0191\45\3\1\0\3\3\32\0"+
    "\1\u0192\114\0\1\u0193\74\0\1\246\127\0\1\u0194\107\0"+
    "\1\u0195\54\0\1\u0168\117\0\1\u0196\67\0\1\u0197\101\0"+
    "\1\u0152\140\0\1\376\72\0\1\u0198\74\0\1\u0199\70\0"+
    "\1\u019a\101\0\1\u019b\120\0\1\u019c\100\0\1\u019d\102\0"+
    "\1\u019e\74\0\1\u0158\47\0\3\3\26\0\26\3\1\u019f"+
    "\17\3\1\0\3\3\1\0\3\3\26\0\4\3\1\u01a0"+
    "\41\3\1\0\3\3\36\0\1\u013c\110\0\1\u01a1\105\0"+
    "\1\u0146\111\0\1\u01a2\106\0\1\246\75\0\1\376\7\0"+
    "\1\u01a3\55\0\1\u01a4\107\0\1\u01a5\105\0\1\u01a6\107\0"+
    "\1\u01a7\103\0\1\u01a8\71\0\1\u01a9\112\0\1\u01aa\43\0"+
    "\3\3\26\0\30\3\1\u01ab\15\3\1\0\3\3\1\0"+
    "\3\3\26\0\7\3\1\143\36\3\1\0\3\3\56\0"+
    "\1\u01ac\104\0\1\u01ad\71\0\1\u0146\24\0\1\u01ae\101\0"+
    "\1\u0156\71\0\1\u01af\64\0\1\u01b0\76\0\1\u01b1\110\0"+
    "\1\240\77\0\1\u01b2\103\0\1\u01b3\51\0\3\3\26\0"+
    "\1\103\45\3\1\0\3\3\37\0\1\u01b4\110\0\1\u01b5"+
    "\111\0\1\u01b6\65\0\1\u01b7\110\0\1\u01b8\113\0\1\u01b9"+
    "\110\0\1\u01ba\66\0\1\u01bb\125\0\1\u01bc\52\0\1\u01bd"+
    "\112\0\1\u01be\106\0\1\u01bf\102\0\1\u01c0\101\0\1\u01c1"+
    "\103\0\1\u0130\141\0\1\u01c2\41\0\1\205\104\0\1\326"+
    "\100\0\1\u01c3\102\0\1\u01c4\103\0\1\u01c5\122\0\1\376"+
    "\65\0\1\u01c6\102\0\1\u01c7\147\0\1\343\41\0\1\u01c8"+
    "\101\0\1\u01c9\105\0\1\327\110\0\1\u01ca\76\0\1\u01cb"+
    "\152\0\1\u01cc\32\0\1\327\117\0\1\376\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[29920];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\3\1\1\11\6\1\5\11"+
    "\1\1\1\11\16\1\1\0\1\1\4\11\1\0\1\11"+
    "\15\1\2\0\7\1\1\0\16\1\14\0\5\1\1\11"+
    "\17\1\33\0\14\1\40\0\1\1\5\0\12\1\30\0"+
    "\1\1\15\0\10\1\3\0\1\11\40\0\5\1\36\0"+
    "\4\1\36\0\4\1\24\0\2\1\3\0\1\1\16\0"+
    "\2\1\15\0\2\1\12\0\1\1\10\0\1\1\25\0"+
    "\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[460];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String lexeme;
guardarInfoCod c = new guardarInfoCod();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { c.linea=yyline;lexeme=yytext(); return parentesis_c;
          }
        case 23: break;
        case 16: 
          { c.linea=yyline;lexeme=yytext(); return llave_c;
          }
        case 24: break;
        case 8: 
          { c.linea=yyline; lexeme=yytext(); return op_logico;
          }
        case 25: break;
        case 13: 
          { c.linea=yyline;lexeme=yytext(); return corchete_a;
          }
        case 26: break;
        case 22: 
          { c.linea=yyline;lexeme=yytext(); return p_reservada;
          }
        case 27: break;
        case 9: 
          { c.linea=yyline;lexeme=yytext(); return op_relacional;
          }
        case 28: break;
        case 6: 
          { c.linea=yyline;lexeme=yytext();return saltoLinea;
          }
        case 29: break;
        case 11: 
          { c.linea=yyline;lexeme=yytext(); return parentesis_a;
          }
        case 30: break;
        case 17: 
          { c.linea=yyline;lexeme=yytext(); return dos_puntos;
          }
        case 31: break;
        case 15: 
          { c.linea=yyline;lexeme=yytext(); return llave_a;
          }
        case 32: break;
        case 7: 
          { c.linea=yyline;lexeme=yytext();return comillas;
          }
        case 33: break;
        case 10: 
          { c.linea=yyline;lexeme=yytext(); return op_asignacion;
          }
        case 34: break;
        case 2: 
          { c.linea=yyline;lexeme=yytext(); return identificador;
          }
        case 35: break;
        case 20: 
          { c.linea=yyline;lexeme=yytext(); return op_decremento;
          }
        case 36: break;
        case 1: 
          { c.linea=yyline;lexeme=yytext(); return ERROR;
          }
        case 37: break;
        case 21: 
          { c.linea=yyline;lexeme=yytext(); return otros;
          }
        case 38: break;
        case 18: 
          { c.linea=yyline;lexeme=yytext(); return p_coma;
          }
        case 39: break;
        case 4: 
          { /*Ignore*/
          }
        case 40: break;
        case 19: 
          { c.linea=yyline;lexeme=yytext();return op_incremento;
          }
        case 41: break;
        case 5: 
          { c.linea=yyline;lexeme=yytext(); return op_aritmetico;
          }
        case 42: break;
        case 14: 
          { c.linea=yyline;lexeme=yytext(); return corchete_c;
          }
        case 43: break;
        case 3: 
          { c.linea=yyline;lexeme=yytext(); return numero;
          }
        case 44: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
