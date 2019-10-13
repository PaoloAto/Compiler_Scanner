// Generated from D:/IdeaProjects/Compiler_Scanner-master/src\SLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, BOOLEAN=2, BREAK=3, BYTE=4, CASE=5, CATCH=6, CHAR=7, CLASS=8, 
		CONST=9, CONTINUE=10, DEFAULT=11, DO=12, DOUBLE=13, ELSE=14, ENUM=15, 
		EXTENDS=16, FINAL=17, FINALLY=18, FLOAT=19, FOR=20, IF=21, GOTO=22, IMPLEMENTS=23, 
		IMPORT=24, INSTANCEOF=25, INT=26, INTERFACE=27, LONG=28, NATIVE=29, NEW=30, 
		PACKAGE=31, PRIVATE=32, PROTECTED=33, PUBLIC=34, RETURN=35, SHORT=36, 
		STATIC=37, STRICTFP=38, SUPER=39, SWITCH=40, SYNCHRONIZED=41, THIS=42, 
		THROW=43, THROWS=44, TRANSIENT=45, TRY=46, VOID=47, VOLATILE=48, WHILE=49, 
		STRING=50, WS=51, LINE_COMMENT=52, LPAREN=53, RPAREN=54, EQUALS=55, SEMICO=56, 
		ASSIGN=57, LBRACK=58, RBRACK=59, LESSTN=60, GESSTN=61, NOTOPN=62, APPROX=63, 
		OPTION=64, COLON=65, DEQUAL=66, LEQUAL=67, GEQUAL=68, NEQUAL=69, ANDD=70, 
		ORR=71, INCR=72, DECR=73, ADD=74, MINUS=75, TIMES=76, DIVIDE=77, AND=78, 
		OR=79, EXP=80, PERC=81, DLEFT=82, RIGHT=83, QRIGHT=84, PEQUAL=85, MEQUAL=86, 
		TEQUAL=87, SEQUAL=88, AEQUAL=89, OEQUAL=90, EEQUAL=91, REQUAL=92, DLEQUAL=93, 
		DRQUAL=94;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
			"CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", 
			"FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", 
			"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
			"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
			"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
			"TRY", "VOID", "VOLATILE", "WHILE", "STRING", "WS", "LINE_COMMENT", "LPAREN", 
			"RPAREN", "EQUALS", "SEMICO", "ASSIGN", "LBRACK", "RBRACK", "LESSTN", 
			"GESSTN", "NOTOPN", "APPROX", "OPTION", "COLON", "DEQUAL", "LEQUAL", 
			"GEQUAL", "NEQUAL", "ANDD", "ORR", "INCR", "DECR", "ADD", "MINUS", "TIMES", 
			"DIVIDE", "AND", "OR", "EXP", "PERC", "DLEFT", "RIGHT", "QRIGHT", "PEQUAL", 
			"MEQUAL", "TEQUAL", "SEQUAL", "AEQUAL", "OEQUAL", "EEQUAL", "REQUAL", 
			"DLEQUAL", "DRQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstrakto'", "'boorean'", "'bureko'", "'byto'", "'kesu'", "'katchu'", 
			"'karu'", "'kurasu'", "'konst'", "'kontinu'", "'deporuto'", "'do'", "'doburu'", 
			"'erusu'", "'enumu'", "'extendo'", "'finar'", "'finarri'", "'furoto'", 
			"'foru'", "'ifu'", "'iku'", "'impremento'", "'importo'", "'insutaof'", 
			"'into'", "'intefeseru'", "'rongu'", "'netivu'", "'newu'", "'pakeju'", 
			"'privatto'", "'protekto'", "'pubriko'", "'returno'", "'shorto'", "'statiku'", 
			"'strictofp'", "'supa'", "'switchu'", "'sinkuronaizu'", "'disu'", "'throwu'", 
			"'throwsu'", "'transento'", "'tryu'", "'boido'", "'voratiru'", "'wairu'", 
			null, null, null, "'('", "')'", "'='", "';'", "':='", "'{'", "'}'", "'<'", 
			"'>'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'<<'", "'>>'", "'>>>>'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
			"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
			"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
			"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", 
			"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "STRING", "WS", "LINE_COMMENT", 
			"LPAREN", "RPAREN", "EQUALS", "SEMICO", "ASSIGN", "LBRACK", "RBRACK", 
			"LESSTN", "GESSTN", "NOTOPN", "APPROX", "OPTION", "COLON", "DEQUAL", 
			"LEQUAL", "GEQUAL", "NEQUAL", "ANDD", "ORR", "INCR", "DECR", "ADD", "MINUS", 
			"TIMES", "DIVIDE", "AND", "OR", "EXP", "PERC", "DLEFT", "RIGHT", "QRIGHT", 
			"PEQUAL", "MEQUAL", "TEQUAL", "SEQUAL", "AEQUAL", "OEQUAL", "EEQUAL", 
			"REQUAL", "DLEQUAL", "DRQUAL"
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


	public SLexerLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2`\u02b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0220\n\63"+
		"\r\63\16\63\u0221\3\63\3\63\3\63\3\63\7\63\u0228\n\63\f\63\16\63\u022b"+
		"\13\63\3\63\5\63\u022e\n\63\3\64\6\64\u0231\n\64\r\64\16\64\u0232\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\7\65\u023b\n\65\f\65\16\65\u023e\13\65\3\65"+
		"\5\65\u0241\n\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3D\3"+
		"D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\3"+
		"L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3"+
		"U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3"+
		"]\3]\3]\3^\3^\3^\3^\3_\3_\3_\3_\2\2`\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\3\2"+
		"\7\6\2\62;B\\aac|\6\2\f\f\17\17$$^^\4\2$$^^\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\2\u02ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\3\u00bf\3\2\2\2\5\u00c9\3\2\2"+
		"\2\7\u00d1\3\2\2\2\t\u00d8\3\2\2\2\13\u00dd\3\2\2\2\r\u00e2\3\2\2\2\17"+
		"\u00e9\3\2\2\2\21\u00ee\3\2\2\2\23\u00f5\3\2\2\2\25\u00fb\3\2\2\2\27\u0103"+
		"\3\2\2\2\31\u010c\3\2\2\2\33\u010f\3\2\2\2\35\u0116\3\2\2\2\37\u011c\3"+
		"\2\2\2!\u0122\3\2\2\2#\u012a\3\2\2\2%\u0130\3\2\2\2\'\u0138\3\2\2\2)\u013f"+
		"\3\2\2\2+\u0144\3\2\2\2-\u0148\3\2\2\2/\u014c\3\2\2\2\61\u0157\3\2\2\2"+
		"\63\u015f\3\2\2\2\65\u0168\3\2\2\2\67\u016d\3\2\2\29\u0178\3\2\2\2;\u017e"+
		"\3\2\2\2=\u0185\3\2\2\2?\u018a\3\2\2\2A\u0191\3\2\2\2C\u019a\3\2\2\2E"+
		"\u01a3\3\2\2\2G\u01ab\3\2\2\2I\u01b3\3\2\2\2K\u01ba\3\2\2\2M\u01c2\3\2"+
		"\2\2O\u01cc\3\2\2\2Q\u01d1\3\2\2\2S\u01d9\3\2\2\2U\u01e6\3\2\2\2W\u01eb"+
		"\3\2\2\2Y\u01f2\3\2\2\2[\u01fa\3\2\2\2]\u0204\3\2\2\2_\u0209\3\2\2\2a"+
		"\u020f\3\2\2\2c\u0218\3\2\2\2e\u022d\3\2\2\2g\u0230\3\2\2\2i\u0236\3\2"+
		"\2\2k\u0246\3\2\2\2m\u0248\3\2\2\2o\u024a\3\2\2\2q\u024c\3\2\2\2s\u024e"+
		"\3\2\2\2u\u0251\3\2\2\2w\u0253\3\2\2\2y\u0255\3\2\2\2{\u0257\3\2\2\2}"+
		"\u0259\3\2\2\2\177\u025b\3\2\2\2\u0081\u025d\3\2\2\2\u0083\u025f\3\2\2"+
		"\2\u0085\u0261\3\2\2\2\u0087\u0264\3\2\2\2\u0089\u0267\3\2\2\2\u008b\u026a"+
		"\3\2\2\2\u008d\u026d\3\2\2\2\u008f\u0270\3\2\2\2\u0091\u0273\3\2\2\2\u0093"+
		"\u0276\3\2\2\2\u0095\u0279\3\2\2\2\u0097\u027b\3\2\2\2\u0099\u027d\3\2"+
		"\2\2\u009b\u027f\3\2\2\2\u009d\u0281\3\2\2\2\u009f\u0283\3\2\2\2\u00a1"+
		"\u0285\3\2\2\2\u00a3\u0287\3\2\2\2\u00a5\u0289\3\2\2\2\u00a7\u028c\3\2"+
		"\2\2\u00a9\u028f\3\2\2\2\u00ab\u0294\3\2\2\2\u00ad\u0297\3\2\2\2\u00af"+
		"\u029a\3\2\2\2\u00b1\u029d\3\2\2\2\u00b3\u02a0\3\2\2\2\u00b5\u02a3\3\2"+
		"\2\2\u00b7\u02a6\3\2\2\2\u00b9\u02a9\3\2\2\2\u00bb\u02ac\3\2\2\2\u00bd"+
		"\u02b0\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7u\2"+
		"\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7m\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7q\2\2\u00c8\4\3\2\2\2\u00c9\u00ca"+
		"\7d\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7p\2\2\u00d0\6\3\2\2\2\u00d1"+
		"\u00d2\7d\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7m\2\2\u00d6\u00d7\7q\2\2\u00d7\b\3\2\2\2\u00d8\u00d9\7d"+
		"\2\2\u00d9\u00da\7{\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dc\n"+
		"\3\2\2\2\u00dd\u00de\7m\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00e1\7w\2\2\u00e1\f\3\2\2\2\u00e2\u00e3\7m\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7w\2\2"+
		"\u00e8\16\3\2\2\2\u00e9\u00ea\7m\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7"+
		"t\2\2\u00ec\u00ed\7w\2\2\u00ed\20\3\2\2\2\u00ee\u00ef\7m\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		"\u00f4\7w\2\2\u00f4\22\3\2\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7q\2\2\u00f7"+
		"\u00f8\7p\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\24\3\2\2\2\u00fb"+
		"\u00fc\7m\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7w\2\2\u0102\26\3\2"+
		"\2\2\u0103\u0104\7f\2\2\u0104\u0105\7g\2\2\u0105\u0106\7r\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7t\2\2\u0108\u0109\7w\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u010b\7q\2\2\u010b\30\3\2\2\2\u010c\u010d\7f\2\2\u010d\u010e\7q\2\2\u010e"+
		"\32\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111\7q\2\2\u0111\u0112\7d\2\2\u0112"+
		"\u0113\7w\2\2\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115\34\3\2\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118\u0119\7w\2\2\u0119\u011a\7u\2\2"+
		"\u011a\u011b\7w\2\2\u011b\36\3\2\2\2\u011c\u011d\7g\2\2\u011d\u011e\7"+
		"p\2\2\u011e\u011f\7w\2\2\u011f\u0120\7o\2\2\u0120\u0121\7w\2\2\u0121 "+
		"\3\2\2\2\u0122\u0123\7g\2\2\u0123\u0124\7z\2\2\u0124\u0125\7v\2\2\u0125"+
		"\u0126\7g\2\2\u0126\u0127\7p\2\2\u0127\u0128\7f\2\2\u0128\u0129\7q\2\2"+
		"\u0129\"\3\2\2\2\u012a\u012b\7h\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p"+
		"\2\2\u012d\u012e\7c\2\2\u012e\u012f\7t\2\2\u012f$\3\2\2\2\u0130\u0131"+
		"\7h\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7t\2\2\u0136\u0137\7k\2\2\u0137&\3\2\2\2\u0138"+
		"\u0139\7h\2\2\u0139\u013a\7w\2\2\u013a\u013b\7t\2\2\u013b\u013c\7q\2\2"+
		"\u013c\u013d\7v\2\2\u013d\u013e\7q\2\2\u013e(\3\2\2\2\u013f\u0140\7h\2"+
		"\2\u0140\u0141\7q\2\2\u0141\u0142\7t\2\2\u0142\u0143\7w\2\2\u0143*\3\2"+
		"\2\2\u0144\u0145\7k\2\2\u0145\u0146\7h\2\2\u0146\u0147\7w\2\2\u0147,\3"+
		"\2\2\2\u0148\u0149\7k\2\2\u0149\u014a\7m\2\2\u014a\u014b\7w\2\2\u014b"+
		".\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7o\2\2\u014e\u014f\7r\2\2\u014f"+
		"\u0150\7t\2\2\u0150\u0151\7g\2\2\u0151\u0152\7o\2\2\u0152\u0153\7g\2\2"+
		"\u0153\u0154\7p\2\2\u0154\u0155\7v\2\2\u0155\u0156\7q\2\2\u0156\60\3\2"+
		"\2\2\u0157\u0158\7k\2\2\u0158\u0159\7o\2\2\u0159\u015a\7r\2\2\u015a\u015b"+
		"\7q\2\2\u015b\u015c\7t\2\2\u015c\u015d\7v\2\2\u015d\u015e\7q\2\2\u015e"+
		"\62\3\2\2\2\u015f\u0160\7k\2\2\u0160\u0161\7p\2\2\u0161\u0162\7u\2\2\u0162"+
		"\u0163\7w\2\2\u0163\u0164\7v\2\2\u0164\u0165\7c\2\2\u0165\u0166\7q\2\2"+
		"\u0166\u0167\7h\2\2\u0167\64\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a\7"+
		"p\2\2\u016a\u016b\7v\2\2\u016b\u016c\7q\2\2\u016c\66\3\2\2\2\u016d\u016e"+
		"\7k\2\2\u016e\u016f\7p\2\2\u016f\u0170\7v\2\2\u0170\u0171\7g\2\2\u0171"+
		"\u0172\7h\2\2\u0172\u0173\7g\2\2\u0173\u0174\7u\2\2\u0174\u0175\7g\2\2"+
		"\u0175\u0176\7t\2\2\u0176\u0177\7w\2\2\u01778\3\2\2\2\u0178\u0179\7t\2"+
		"\2\u0179\u017a\7q\2\2\u017a\u017b\7p\2\2\u017b\u017c\7i\2\2\u017c\u017d"+
		"\7w\2\2\u017d:\3\2\2\2\u017e\u017f\7p\2\2\u017f\u0180\7g\2\2\u0180\u0181"+
		"\7v\2\2\u0181\u0182\7k\2\2\u0182\u0183\7x\2\2\u0183\u0184\7w\2\2\u0184"+
		"<\3\2\2\2\u0185\u0186\7p\2\2\u0186\u0187\7g\2\2\u0187\u0188\7y\2\2\u0188"+
		"\u0189\7w\2\2\u0189>\3\2\2\2\u018a\u018b\7r\2\2\u018b\u018c\7c\2\2\u018c"+
		"\u018d\7m\2\2\u018d\u018e\7g\2\2\u018e\u018f\7l\2\2\u018f\u0190\7w\2\2"+
		"\u0190@\3\2\2\2\u0191\u0192\7r\2\2\u0192\u0193\7t\2\2\u0193\u0194\7k\2"+
		"\2\u0194\u0195\7x\2\2\u0195\u0196\7c\2\2\u0196\u0197\7v\2\2\u0197\u0198"+
		"\7v\2\2\u0198\u0199\7q\2\2\u0199B\3\2\2\2\u019a\u019b\7r\2\2\u019b\u019c"+
		"\7t\2\2\u019c\u019d\7q\2\2\u019d\u019e\7v\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7m\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7q\2\2\u01a2D\3\2\2\2\u01a3"+
		"\u01a4\7r\2\2\u01a4\u01a5\7w\2\2\u01a5\u01a6\7d\2\2\u01a6\u01a7\7t\2\2"+
		"\u01a7\u01a8\7k\2\2\u01a8\u01a9\7m\2\2\u01a9\u01aa\7q\2\2\u01aaF\3\2\2"+
		"\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af"+
		"\7w\2\2\u01af\u01b0\7t\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7q\2\2\u01b2"+
		"H\3\2\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7j\2\2\u01b5\u01b6\7q\2\2\u01b6"+
		"\u01b7\7t\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7q\2\2\u01b9J\3\2\2\2\u01ba"+
		"\u01bb\7u\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7v\2\2"+
		"\u01be\u01bf\7k\2\2\u01bf\u01c0\7m\2\2\u01c0\u01c1\7w\2\2\u01c1L\3\2\2"+
		"\2\u01c2\u01c3\7u\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6"+
		"\7k\2\2\u01c6\u01c7\7e\2\2\u01c7\u01c8\7v\2\2\u01c8\u01c9\7q\2\2\u01c9"+
		"\u01ca\7h\2\2\u01ca\u01cb\7r\2\2\u01cbN\3\2\2\2\u01cc\u01cd\7u\2\2\u01cd"+
		"\u01ce\7w\2\2\u01ce\u01cf\7r\2\2\u01cf\u01d0\7c\2\2\u01d0P\3\2\2\2\u01d1"+
		"\u01d2\7u\2\2\u01d2\u01d3\7y\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7v\2\2"+
		"\u01d5\u01d6\7e\2\2\u01d6\u01d7\7j\2\2\u01d7\u01d8\7w\2\2\u01d8R\3\2\2"+
		"\2\u01d9\u01da\7u\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd"+
		"\7m\2\2\u01dd\u01de\7w\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7q\2\2\u01e0"+
		"\u01e1\7p\2\2\u01e1\u01e2\7c\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7|\2\2"+
		"\u01e4\u01e5\7w\2\2\u01e5T\3\2\2\2\u01e6\u01e7\7f\2\2\u01e7\u01e8\7k\2"+
		"\2\u01e8\u01e9\7u\2\2\u01e9\u01ea\7w\2\2\u01eaV\3\2\2\2\u01eb\u01ec\7"+
		"v\2\2\u01ec\u01ed\7j\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0"+
		"\7y\2\2\u01f0\u01f1\7w\2\2\u01f1X\3\2\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4"+
		"\7j\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7y\2\2\u01f7"+
		"\u01f8\7u\2\2\u01f8\u01f9\7w\2\2\u01f9Z\3\2\2\2\u01fa\u01fb\7v\2\2\u01fb"+
		"\u01fc\7t\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7p\2\2\u01fe\u01ff\7u\2\2"+
		"\u01ff\u0200\7g\2\2\u0200\u0201\7p\2\2\u0201\u0202\7v\2\2\u0202\u0203"+
		"\7q\2\2\u0203\\\3\2\2\2\u0204\u0205\7v\2\2\u0205\u0206\7t\2\2\u0206\u0207"+
		"\7{\2\2\u0207\u0208\7w\2\2\u0208^\3\2\2\2\u0209\u020a\7d\2\2\u020a\u020b"+
		"\7q\2\2\u020b\u020c\7k\2\2\u020c\u020d\7f\2\2\u020d\u020e\7q\2\2\u020e"+
		"`\3\2\2\2\u020f\u0210\7x\2\2\u0210\u0211\7q\2\2\u0211\u0212\7t\2\2\u0212"+
		"\u0213\7c\2\2\u0213\u0214\7v\2\2\u0214\u0215\7k\2\2\u0215\u0216\7t\2\2"+
		"\u0216\u0217\7w\2\2\u0217b\3\2\2\2\u0218\u0219\7y\2\2\u0219\u021a\7c\2"+
		"\2\u021a\u021b\7k\2\2\u021b\u021c\7t\2\2\u021c\u021d\7w\2\2\u021dd\3\2"+
		"\2\2\u021e\u0220\t\2\2\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u022e\3\2\2\2\u0223\u0229\7$"+
		"\2\2\u0224\u0228\n\3\2\2\u0225\u0226\7^\2\2\u0226\u0228\t\4\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c"+
		"\u022e\7$\2\2\u022d\u021f\3\2\2\2\u022d\u0223\3\2\2\2\u022ef\3\2\2\2\u022f"+
		"\u0231\t\5\2\2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\b\64\2\2\u0235"+
		"h\3\2\2\2\u0236\u0237\7\61\2\2\u0237\u0238\7\61\2\2\u0238\u023c\3\2\2"+
		"\2\u0239\u023b\n\6\2\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023f"+
		"\u0241\7\17\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3"+
		"\2\2\2\u0242\u0243\7\f\2\2\u0243\u0244\3\2\2\2\u0244\u0245\b\65\2\2\u0245"+
		"j\3\2\2\2\u0246\u0247\7*\2\2\u0247l\3\2\2\2\u0248\u0249\7+\2\2\u0249n"+
		"\3\2\2\2\u024a\u024b\7?\2\2\u024bp\3\2\2\2\u024c\u024d\7=\2\2\u024dr\3"+
		"\2\2\2\u024e\u024f\7<\2\2\u024f\u0250\7?\2\2\u0250t\3\2\2\2\u0251\u0252"+
		"\7}\2\2\u0252v\3\2\2\2\u0253\u0254\7\177\2\2\u0254x\3\2\2\2\u0255\u0256"+
		"\7>\2\2\u0256z\3\2\2\2\u0257\u0258\7@\2\2\u0258|\3\2\2\2\u0259\u025a\7"+
		"#\2\2\u025a~\3\2\2\2\u025b\u025c\7\u0080\2\2\u025c\u0080\3\2\2\2\u025d"+
		"\u025e\7A\2\2\u025e\u0082\3\2\2\2\u025f\u0260\7<\2\2\u0260\u0084\3\2\2"+
		"\2\u0261\u0262\7?\2\2\u0262\u0263\7?\2\2\u0263\u0086\3\2\2\2\u0264\u0265"+
		"\7>\2\2\u0265\u0266\7?\2\2\u0266\u0088\3\2\2\2\u0267\u0268\7@\2\2\u0268"+
		"\u0269\7?\2\2\u0269\u008a\3\2\2\2\u026a\u026b\7#\2\2\u026b\u026c\7?\2"+
		"\2\u026c\u008c\3\2\2\2\u026d\u026e\7(\2\2\u026e\u026f\7(\2\2\u026f\u008e"+
		"\3\2\2\2\u0270\u0271\7~\2\2\u0271\u0272\7~\2\2\u0272\u0090\3\2\2\2\u0273"+
		"\u0274\7-\2\2\u0274\u0275\7-\2\2\u0275\u0092\3\2\2\2\u0276\u0277\7/\2"+
		"\2\u0277\u0278\7/\2\2\u0278\u0094\3\2\2\2\u0279\u027a\7-\2\2\u027a\u0096"+
		"\3\2\2\2\u027b\u027c\7/\2\2\u027c\u0098\3\2\2\2\u027d\u027e\7,\2\2\u027e"+
		"\u009a\3\2\2\2\u027f\u0280\7\61\2\2\u0280\u009c\3\2\2\2\u0281\u0282\7"+
		"(\2\2\u0282\u009e\3\2\2\2\u0283\u0284\7~\2\2\u0284\u00a0\3\2\2\2\u0285"+
		"\u0286\7`\2\2\u0286\u00a2\3\2\2\2\u0287\u0288\7\'\2\2\u0288\u00a4\3\2"+
		"\2\2\u0289\u028a\7>\2\2\u028a\u028b\7>\2\2\u028b\u00a6\3\2\2\2\u028c\u028d"+
		"\7@\2\2\u028d\u028e\7@\2\2\u028e\u00a8\3\2\2\2\u028f\u0290\7@\2\2\u0290"+
		"\u0291\7@\2\2\u0291\u0292\7@\2\2\u0292\u0293\7@\2\2\u0293\u00aa\3\2\2"+
		"\2\u0294\u0295\7-\2\2\u0295\u0296\7?\2\2\u0296\u00ac\3\2\2\2\u0297\u0298"+
		"\7/\2\2\u0298\u0299\7?\2\2\u0299\u00ae\3\2\2\2\u029a\u029b\7,\2\2\u029b"+
		"\u029c\7?\2\2\u029c\u00b0\3\2\2\2\u029d\u029e\7\61\2\2\u029e\u029f\7?"+
		"\2\2\u029f\u00b2\3\2\2\2\u02a0\u02a1\7(\2\2\u02a1\u02a2\7?\2\2\u02a2\u00b4"+
		"\3\2\2\2\u02a3\u02a4\7~\2\2\u02a4\u02a5\7?\2\2\u02a5\u00b6\3\2\2\2\u02a6"+
		"\u02a7\7`\2\2\u02a7\u02a8\7?\2\2\u02a8\u00b8\3\2\2\2\u02a9\u02aa\7\'\2"+
		"\2\u02aa\u02ab\7?\2\2\u02ab\u00ba\3\2\2\2\u02ac\u02ad\7>\2\2\u02ad\u02ae"+
		"\7>\2\2\u02ae\u02af\7?\2\2\u02af\u00bc\3\2\2\2\u02b0\u02b1\7@\2\2\u02b1"+
		"\u02b2\7@\2\2\u02b2\u02b3\7?\2\2\u02b3\u00be\3\2\2\2\n\2\u0221\u0227\u0229"+
		"\u022d\u0232\u023c\u0240\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}