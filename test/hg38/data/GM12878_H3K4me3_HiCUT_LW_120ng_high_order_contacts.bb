                                                                                                                                                                                                                                                                                                                table bed
"Browser Extensible Data"
   (
   string chrom;       "Reference sequence chromosome or scaffold"
   uint   chromStart;  "Start position in chromosome"
   uint   chromEnd;    "End position in chromosome"
   string name;        "Name of item."
   uint score;          "Score (0-1000)"
   char[1] strand;     "+ or - for strand"
   uint thickStart;   "Start of where display should be thick (start codon)"
   uint thickEnd;     "End of where display should be thick (stop codon)"
   uint reserved;     "Used as itemRgb as of 2004-11-22"
   int blockCount;    "Number of blocks"
   int[blockCount] blockSizes; "Comma separated list of block sizes"
   int[blockCount] chromStarts; "Start positions relative to chromStart"
   )
                                                                                                         ���x                          chr1     ��chr10   .��chr11   Bchr12   ���chr13   ��chr14   �[achr15   Cchr16   )tbchr17   ah�chr18	   %f�chr19
   o~chr2    y�ochr20   W�chr21   ߼�chr22   �mchr3    ��chr4    �qVchr5    ��
chr6    �J.
chr7    5m	chr8    ̣�chr9    ]�?chrX    ��L	](      