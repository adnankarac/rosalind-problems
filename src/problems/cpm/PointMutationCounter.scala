package problems.cpm

object PointMutationCounter {
	def solve(str1 : String, str2 : String) : Int = {
	  val lst1 : List[Char] = str1.toList
	  val lst2 : List[Char] = str2.toList
	  (lst1 zip lst2).count(p => p._1!=p._2)
	}
	
	solve("CCCTCTGTCCGCCCACCAGAGACGCACCGAGTGACGTCCTCTCTTGAATGCGCAAACCGATGTCTCACTCCAAAAATGAATTCGTCTAGTGTCCCGCTTCCTAGCCAACCGTGTCTAGACCGCAAACGCTCGTTGGAGACGGTCCCAGTGAGAATCAATTATCGCACGGTCGCCTCGTTGCTTGACATCATTCAGCGATGTCTTAAGGTCCAGTCGTAGTCTGAGCCACCCGTTTATTATGACATCCCGTTGACCCCTTTAAGTTCTGCAGACAGAAAGTACAAGTTTTTTGGTGTCAGTCTCTGGTTTTACCTTCAACCCGCTGCTAGGGCTCGACTGCGACTGATCTTCTGGGCACGCTTATCTCAACGTTGTCTACAGACTCTATATGAATTATACTCTGTCATAGTCAGCATGCTATATCGAAAGCATGGGCATCCAAGGATCTGGAGCTGTGCGTCCCTATTTCCCTGATCCTAACGGACGACTACTACACAGGCCGCTGATTATGGTCTAGTACTGCCTATAACTCCGCATAAAATAAAAGTGAATTCGCAGCGAGCTCCGGGAAGTGGGTGCCGTGACGTTGTAGAATAGCGACCGAAATTATTTAAGTAACGTAGTTCGCTCAGCCAGGGACCGCGAAAAAGCAGGCAAGCGTTGCATATGGTTCGCTCTCCAGCAAGTTAGAAGGGGTACCAAATTGGGCCACAAATACTTAATGAGTCGGTAGTTTTTCCCATCATCCCATCGCCGGACAGACCATAAGTTATCGAGTGTCACGGTGCTACAAAAGCTATGCTTGGACCAATGTACTTGTCGTGTAGTGAACCAAGGTCAGAGTGAACGGCTCTACGCGGGGTGAGCTAAGCACACCCATCCCACCACGAATCCCCTTGA","TCAACTGGCATTCCCCGAGTTACGGCTCGAATGAGTTGCAATGTTTCTAGTTCAAACGAACGTTCGCCTATAAATCCCGCGTCGCCGACTGAGCGACTCCCAATCCAGATCGGCGTAGGCCACAACCGCCCAGTGTATTCGACCGAATAGGGCATGCTTGCCTGGACGATCAACTCGTTGCCACAGACCATGCGGCAATAACTAATCGCCCAGTCGTTCTCAAAAGGATTCTACGAGTCGGCAGTCCTCTAAATACCAGTACGTTATGCAGACAATAAGGATCGCTTTTTAGGACTATTGCGCAGGTTGATCGTACTGAACGGTGCTATGGCTTGTCCACGATTTAAATGTTGGAAACACATAGCTCGACATCGAATCGTCTCTGTACAGCCAATTAAACCTGAAATAGAAATCCTAGTTTATTTAAAGCTTGGGTATTCACATAAATGACGATTCGCGACACGACGCGATCGGTTATCACTTGCCTCGCTTAGGGGTACCCCCAAGGACGGTGAATCACCGCGTGACACTGCGAAAAAAAACATGACGAATGTACAGCATGGTTCGGGAATTAGGGGGGGTGACGCTTACGAATCGCGTCAGCGATAAATTAACTAACATAGATCGCGAGGCAAAATGCCAGTTGGAAGCTTTCGAGTGTTGGTTTTGCGTTTCAGCTTGATAAGTAAGATGCTGATCGAAATGGCTCTGAAAATATAGTTTGACCCGGTACTAGTAAGCATGCTGTTTTCGACCGACCGAGGACAAATCCGTGAAGTTTTCGACGTTAAGAAAGATGAGACTGGTTCAAGACCCGGTTCCCCTTGTCAATAAGGCCCAATATTAATCGCAGTTAGAGCGGCGAGATCTGGACTCGCGTATAGCATTGGTTGCCTTGGA")
}