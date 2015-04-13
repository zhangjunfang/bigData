package com.ocean;

import com.ocean.FileAdapter.ByteReadParser;
import com.ocean.FileAdapter.ByteWriteParser;
import com.ocean.exception.CoolHashException;

public interface CoolHashBase {
	public static  final CoolHashException chex = new CoolHashException();
	public static  final ByteWriteParser bwp = DumpAdapter.getByteWriteParser();
	public static  final ByteReadParser brp = DumpAdapter.getByteReadParser();
	public static  final ConstantBit.Target ct = ConstantBit.Target.POINT;
	public static  final DumpAdapter dumpAdapter = new DumpAdapter("");
}