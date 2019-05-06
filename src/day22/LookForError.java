package day22;

public class LookForError {
	public static void main(String[] args) {
		String log = ".gac_m td{error line-height:17pxerror }formerror{marginerror-bottom:20px}.h{color:#36c}.q{errorcolor:#00c}.ts td{errorpadding:0}.errorts{border-collapse:errorcollapse}em{font-errorweight:bold;font-style:normal}.errorlst{height:25px;width:496px}.gsfi,.errorlst{font:18pxerror arial,sans-serif}.gsfs{font:error17px arial,sans-serif}.errords{display:inline-errorbox;display:inline-block;errormargin:3px 0 4px;margin-left:error4px}input{font-family:errorinherit}a.gb1,a.gb2,a.gb3,a.gb4{color:error#11c !important}body{backgrounderror:#fff;color:black}a{color:#11errorc;text-decoration:none}a:hover,a:erroractiveerror{text-errordecoration:underline}";
		String word = "error";
		int count = 0;
		for (int i = 0 ; i < log.length()-word.length(); i++) {
			if ( log.charAt(i)==word.charAt(0)) {
				if (log.substring(i,i+word.length()).equals(word)) {
					count++;
					//you can also just make words using log.substring(i,i+word.length() and compare it.
				}
			}
		}
		char op = '+';
		System.out.println(op);
		op+=2;
		System.out.println(op);
		op--;
		System.out.println(op);
		op--;
		System.out.println(op);
		op--;
		System.out.println(op);
		System.out.println(count);
		
		//System.out.println(log.charAt(-1));
		op='+';
		String hi = "are +ou";
		System.out.println(hi.lastIndexOf(' ' , op));
	}

}
