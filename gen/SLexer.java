// Generated from C:/Users/DELL/IdeaProjects/Compiler_Scanner/src\SLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, WS=2, LINE_COMMENT=3, LPAREN=4, RPAREN=5, EQUALS=6, SEMICO=7, 
		ASSIGN=8, LBRACK=9, RBRACK=10, LESSTN=11, GESSTN=12, NOTOPN=13, APPROX=14, 
		OPTION=15, COLON=16, DEQUAL=17, LEQUAL=18, GEQUAL=19, NEQUAL=20, ANDD=21, 
		ORR=22, INCR=23, DECR=24, ADD=25, MINUS=26, TIMES=27, DIVIDE=28, AND=29, 
		OR=30, EXP=31, PERC=32, DLEFT=33, RIGHT=34, QRIGHT=35, PEQUAL=36, MEQUAL=37, 
		TEQUAL=38, SEQUAL=39, AEQUAL=40, OEQUAL=41, EEQUAL=42, REQUAL=43, DLEQUAL=44, 
		DRQUAL=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "WS", "LINE_COMMENT", "LPAREN", "RPAREN", "EQUALS", "SEMICO", 
			"ASSIGN", "LBRACK", "RBRACK", "LESSTN", "GESSTN", "NOTOPN", "APPROX", 
			"OPTION", "COLON", "DEQUAL", "LEQUAL", "GEQUAL", "NEQUAL", "ANDD", "ORR", 
			"INCR", "DECR", "ADD", "MINUS", "TIMES", "DIVIDE", "AND", "OR", "EXP", 
			"PERC", "DLEFT", "RIGHT", "QRIGHT", "PEQUAL", "MEQUAL", "TEQUAL", "SEQUAL", 
			"AEQUAL", "OEQUAL", "EEQUAL", "REQUAL", "DLEQUAL", "DRQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'='", "';'", "':='", "'{'", "'}'", 
			"'<'", "'>'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'<<'", "'>>'", "'>>>>'", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "WS", "LINE_COMMENT", "LPAREN", "RPAREN", "EQUALS", "SEMICO", 
			"ASSIGN", "LBRACK", "RBRACK", "LESSTN", "GESSTN", "NOTOPN", "APPROX", 
			"OPTION", "COLON", "DEQUAL", "LEQUAL", "GEQUAL", "NEQUAL", "ANDD", "ORR", 
			"INCR", "DECR", "ADD", "MINUS", "TIMES", "DIVIDE", "AND", "OR", "EXP", 
			"PERC", "DLEFT", "RIGHT", "QRIGHT", "PEQUAL", "MEQUAL", "TEQUAL", "SEQUAL", 
			"AEQUAL", "OEQUAL", "EEQUAL", "REQUAL", "DLEQUAL", "DRQUAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\6\2_\n\2\r\2\16\2`\3\2\3\2\3\2\3\2\7\2g\n\2\f\2\16"+
		"\2j\13\2\3\2\5\2m\n\2\3\3\6\3p\n\3\r\3\16\3q\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4z\n\4\f\4\16\4}\13\4\3\4\5\4\u0080\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\7\6\2\62;B"+
		"\\aac|\6\2\f\f\17\17$$^^\4\2$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00f9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3l\3\2\2\2\5o\3\2\2\2\7u\3"+
		"\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2"+
		"\2\21\u008d\3\2\2\2\23\u0090\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2"+
		"\31\u0096\3\2\2\2\33\u0098\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!"+
		"\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a3\3\2\2\2\'\u00a6\3\2\2\2)\u00a9\3"+
		"\2\2\2+\u00ac\3\2\2\2-\u00af\3\2\2\2/\u00b2\3\2\2\2\61\u00b5\3\2\2\2\63"+
		"\u00b8\3\2\2\2\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0"+
		"\3\2\2\2=\u00c2\3\2\2\2?\u00c4\3\2\2\2A\u00c6\3\2\2\2C\u00c8\3\2\2\2E"+
		"\u00cb\3\2\2\2G\u00ce\3\2\2\2I\u00d3\3\2\2\2K\u00d6\3\2\2\2M\u00d9\3\2"+
		"\2\2O\u00dc\3\2\2\2Q\u00df\3\2\2\2S\u00e2\3\2\2\2U\u00e5\3\2\2\2W\u00e8"+
		"\3\2\2\2Y\u00eb\3\2\2\2[\u00ef\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`"+
		"^\3\2\2\2`a\3\2\2\2am\3\2\2\2bh\7$\2\2cg\n\3\2\2de\7^\2\2eg\t\4\2\2fc"+
		"\3\2\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2k"+
		"m\7$\2\2l^\3\2\2\2lb\3\2\2\2m\4\3\2\2\2np\t\5\2\2on\3\2\2\2pq\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\3\2\2t\6\3\2\2\2uv\7\61\2\2vw\7\61"+
		"\2\2w{\3\2\2\2xz\n\6\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2~\u0080\7\17\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\4"+
		"\2\2\u0084\b\3\2\2\2\u0085\u0086\7*\2\2\u0086\n\3\2\2\2\u0087\u0088\7"+
		"+\2\2\u0088\f\3\2\2\2\u0089\u008a\7?\2\2\u008a\16\3\2\2\2\u008b\u008c"+
		"\7=\2\2\u008c\20\3\2\2\2\u008d\u008e\7<\2\2\u008e\u008f\7?\2\2\u008f\22"+
		"\3\2\2\2\u0090\u0091\7}\2\2\u0091\24\3\2\2\2\u0092\u0093\7\177\2\2\u0093"+
		"\26\3\2\2\2\u0094\u0095\7>\2\2\u0095\30\3\2\2\2\u0096\u0097\7@\2\2\u0097"+
		"\32\3\2\2\2\u0098\u0099\7#\2\2\u0099\34\3\2\2\2\u009a\u009b\7\u0080\2"+
		"\2\u009b\36\3\2\2\2\u009c\u009d\7A\2\2\u009d \3\2\2\2\u009e\u009f\7<\2"+
		"\2\u009f\"\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7?\2\2\u00a2$\3\2\2"+
		"\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7"+
		"@\2\2\u00a7\u00a8\7?\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab"+
		"\7?\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7(\2\2\u00ae,\3"+
		"\2\2\2\u00af\u00b0\7~\2\2\u00b0\u00b1\7~\2\2\u00b1.\3\2\2\2\u00b2\u00b3"+
		"\7-\2\2\u00b3\u00b4\7-\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6\u00b7"+
		"\7/\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9\64\3\2\2\2\u00ba\u00bb"+
		"\7/\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd8\3\2\2\2\u00be\u00bf"+
		"\7\61\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1<\3\2\2\2\u00c2\u00c3"+
		"\7~\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7`\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7"+
		"\'\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9\u00ca\7>\2\2\u00caD\3\2"+
		"\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd\7@\2\2\u00cdF\3\2\2\2\u00ce\u00cf"+
		"\7@\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2\7@\2\2\u00d2"+
		"H\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\7?\2\2\u00d5J\3\2\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7\u00d8\7?\2\2\u00d8L\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db"+
		"\7?\2\2\u00dbN\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\7?\2\2\u00deP"+
		"\3\2\2\2\u00df\u00e0\7(\2\2\u00e0\u00e1\7?\2\2\u00e1R\3\2\2\2\u00e2\u00e3"+
		"\7~\2\2\u00e3\u00e4\7?\2\2\u00e4T\3\2\2\2\u00e5\u00e6\7`\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7V\3\2\2\2\u00e8\u00e9\7\'\2\2\u00e9\u00ea\7?\2\2\u00eaX\3"+
		"\2\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7?\2\2\u00ee"+
		"Z\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2\7?\2\2\u00f2"+
		"\\\3\2\2\2\n\2`fhlq{\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}