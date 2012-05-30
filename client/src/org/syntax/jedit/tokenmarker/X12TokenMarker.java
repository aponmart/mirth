package org.syntax.jedit.tokenmarker;

import org.syntax.jedit.KeywordMap;

/**
 * HL7 token marker.
 * 
 * @author Chris Lang
 */
public class X12TokenMarker extends EDITokenMarker {
	public X12TokenMarker() {
		super();
	}

	public static KeywordMap getKeywords() {
		if (ccKeywords == null) {
			ccKeywords.add("ISA",Token.KEYWORD3);
			ccKeywords.add("GS",Token.KEYWORD3);
			ccKeywords.add("ST",Token.KEYWORD3);
			ccKeywords.add("BHT",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PER",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("HL",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("CUR",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("PER",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("HL",Token.KEYWORD3);
			ccKeywords.add("SBR",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("DMG",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("CLM",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("CL1",Token.KEYWORD3);
			ccKeywords.add("PWK",Token.KEYWORD3);
			ccKeywords.add("CN1",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("K3",Token.KEYWORD3);
			ccKeywords.add("NTE",Token.KEYWORD3);
			ccKeywords.add("NTE",Token.KEYWORD3);
			ccKeywords.add("CR6",Token.KEYWORD3);
			ccKeywords.add("CRC",Token.KEYWORD3);
			ccKeywords.add("CRC",Token.KEYWORD3);
			ccKeywords.add("CRC",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("QTY",Token.KEYWORD3);
			ccKeywords.add("HCP",Token.KEYWORD3);
			ccKeywords.add("CR7",Token.KEYWORD3);
			ccKeywords.add("HSD",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("SBR",Token.KEYWORD3);
			ccKeywords.add("CAS",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("DMG",Token.KEYWORD3);
			ccKeywords.add("OI",Token.KEYWORD3);
			ccKeywords.add("MIA",Token.KEYWORD3);
			ccKeywords.add("MOA",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("LX",Token.KEYWORD3);
			ccKeywords.add("SV2",Token.KEYWORD3);
			ccKeywords.add("PWK",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("HCP",Token.KEYWORD3);
			ccKeywords.add("LIN",Token.KEYWORD3);
			ccKeywords.add("CTP",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("SVD",Token.KEYWORD3);
			ccKeywords.add("CAS",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("HL",Token.KEYWORD3);
			ccKeywords.add("PAT",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("DMG",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("CLM",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("CL1",Token.KEYWORD3);
			ccKeywords.add("PWK",Token.KEYWORD3);
			ccKeywords.add("CN1",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("K3",Token.KEYWORD3);
			ccKeywords.add("NTE",Token.KEYWORD3);
			ccKeywords.add("NTE",Token.KEYWORD3);
			ccKeywords.add("CR6",Token.KEYWORD3);
			ccKeywords.add("CRC",Token.KEYWORD3);
			ccKeywords.add("CRC",Token.KEYWORD3);
			ccKeywords.add("CRC",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("HI",Token.KEYWORD3);
			ccKeywords.add("QTY",Token.KEYWORD3);
			ccKeywords.add("HCP",Token.KEYWORD3);
			ccKeywords.add("CR7",Token.KEYWORD3);
			ccKeywords.add("HSD",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("SBR",Token.KEYWORD3);
			ccKeywords.add("CAS",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("DMG",Token.KEYWORD3);
			ccKeywords.add("OI",Token.KEYWORD3);
			ccKeywords.add("MIA",Token.KEYWORD3);
			ccKeywords.add("MOA",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("N3",Token.KEYWORD3);
			ccKeywords.add("N4",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("LX",Token.KEYWORD3);
			ccKeywords.add("SV2",Token.KEYWORD3);
			ccKeywords.add("PWK",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("AMT",Token.KEYWORD3);
			ccKeywords.add("HCP",Token.KEYWORD3);
			ccKeywords.add("LIN",Token.KEYWORD3);
			ccKeywords.add("CTP",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("NM1",Token.KEYWORD3);
			ccKeywords.add("PRV",Token.KEYWORD3);
			ccKeywords.add("REF",Token.KEYWORD3);
			ccKeywords.add("SVD",Token.KEYWORD3);
			ccKeywords.add("CAS",Token.KEYWORD3);
			ccKeywords.add("DTP",Token.KEYWORD3);
			ccKeywords.add("SE",Token.KEYWORD3);
			ccKeywords.add("GE",Token.KEYWORD3);
			ccKeywords.add("TA1",Token.KEYWORD3);
			ccKeywords.add("IEA",Token.KEYWORD3);

		}
		return ccKeywords;
	}

	// private members
	private static KeywordMap ccKeywords;
}