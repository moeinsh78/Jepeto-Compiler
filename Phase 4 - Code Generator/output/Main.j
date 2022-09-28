.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public c3(Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "we are in c3"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		.end method
.method public f()Ljava/lang/Boolean;
		.limit stack 128
		.limit locals 128
		new Fptr
		dup
		aload_0
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore_1
		aload_1
		ldc 9
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_1
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_1
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new Fptr
		dup
		aload_0
		ldc "h"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore_2
		aload_2
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore_3
		aload_3
		ldc 7
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_3
		ldc 8
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_3
		ldc 11
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new Fptr
		dup
		aload_0
		ldc "h"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 5
		aload 5
		ldc 9
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 5
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 5
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 5
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new Fptr
		dup
		aload_0
		ldc "c1"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 6
		aload 6
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 6
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		pop
		new Fptr
		dup
		aload_0
		ldc "c2"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		pop
		new Fptr
		dup
		aload_0
		ldc "c3"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		aload_0
		ldc "selector"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 9
		aload 9
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 9
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 9
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmple Label_0
		ldc 1
		goto Label_1
		Label_0:
		ldc 0
		Label_1:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 9
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 9
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 10
		aload 10
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 10
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		aload_0
		ldc "selector"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 11
		aload 11
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 11
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 11
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmple Label_2
		ldc 1
		goto Label_3
		Label_2:
		ldc 0
		Label_3:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 11
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 11
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 12
		aload 12
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 12
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		aload_0
		ldc "selector"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 13
		aload 13
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 13
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 13
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmple Label_4
		ldc 1
		goto Label_5
		Label_4:
		ldc 0
		Label_5:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 13
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 13
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 14
		aload 14
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 14
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		new Fptr
		dup
		aload_0
		ldc "x"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 15
		aload 15
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 15
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 16
		aload 16
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		ldc 4
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		aload 16
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		dup
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 6
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		dup
		ldc 7
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 15
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		areturn
		.end method
.method public g(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		aload_3
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "unreachable"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		.end method
.method public h()LFptr;
		.limit stack 128
		.limit locals 128
		new Fptr
		dup
		aload_0
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		.end method
.method public x(Ljava/lang/Integer;LList;)V
		.limit stack 128
		.limit locals 128
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		aload_2
		invokevirtual List/getSize()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmpeq Label_8
		ldc 0
		goto Label_9
		Label_8:
		ldc 1
		Label_9:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_6
		return
		goto Label_7
		Label_6:
		Label_7:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload_2
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		new Fptr
		dup
		aload_0
		ldc "x"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore_3
		aload_3
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_3
		aload_2
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload_3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
		.end method
.method public selector(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)LFptr;
		.limit stack 128
		.limit locals 128
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		if_icmple Label_12
		ldc 1
		goto Label_13
		Label_12:
		ldc 0
		Label_13:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_14
		aload_3
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_14
		ldc 1
		goto Label_15
		Label_14:
		ldc 0
		Label_15:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifne Label_16
		aload 4
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_18
		ldc 0
		goto Label_19
		Label_18:
		ldc 1
		Label_19:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifne Label_16
		ldc 0
		goto Label_17
		Label_16:
		ldc 1
		Label_17:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_10
		new Fptr
		dup
		aload_0
		ldc "c1"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		goto Label_11
		Label_10:
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		aload_2
		invokevirtual java/lang/Integer/intValue()I
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		if_icmpeq Label_22
		ldc 0
		goto Label_23
		Label_22:
		ldc 1
		Label_23:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_20
		new Fptr
		dup
		aload_0
		ldc "c2"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		goto Label_21
		Label_20:
		new Fptr
		dup
		aload_0
		ldc "c3"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		Label_21:
		Label_11:
		new Fptr
		dup
		aload_0
		ldc "c1"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		.end method
.method public c1(Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "we are in c1"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		.end method
.method public c2(Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "we are in c2"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		aload_1
		invokevirtual java/lang/Integer/intValue()I
		ldc 24
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		idiv
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ineg
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		aload_0
		ldc "f"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore_1
		aload_1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Boolean
		invokevirtual java/lang/Boolean/booleanValue()Z
		invokevirtual java/io/PrintStream/println(Z)V
		return
		.end method
