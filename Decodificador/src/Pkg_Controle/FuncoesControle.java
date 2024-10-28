package Pkg_Controle;


public class FuncoesControle {
    
    public String codificar(char caracter, int repeticao) {
        
        String caracterStr = String.valueOf(caracter);
        String caracterCodificado = "  ";
        
        caracterStr = caracterStr.toLowerCase();
        caracter = caracterStr.charAt(0);
        
        if (repeticao == 1) {
            switch (caracter) {
                // Letras do alfabeto
                case 'a': caracterCodificado = "11"; break;
                case 'b': caracterCodificado = "12"; break;
                case 'c': caracterCodificado = "13"; break;
                case 'd': caracterCodificado = "14"; break;
                case 'e': caracterCodificado = "15"; break;
                case 'f': caracterCodificado = "16"; break;
                case 'g': caracterCodificado = "17"; break;
                case 'h': caracterCodificado = "18"; break;
                case 'i': caracterCodificado = "19"; break;
                case 'j': caracterCodificado = "AA"; break;
                case 'k': caracterCodificado = "AB"; break;
                case 'l': caracterCodificado = "AC"; break;
                case 'm': caracterCodificado = "AD"; break;
                case 'n': caracterCodificado = "AE"; break;
                case 'o': caracterCodificado = "AF"; break;
                case 'p': caracterCodificado = "AG"; break;
                case 'q': caracterCodificado = "AH"; break;
                case 'r': caracterCodificado = "AI"; break;
                case 's': caracterCodificado = "AJ"; break;
                case 't': caracterCodificado = "AK"; break;
                case 'u': caracterCodificado = "AL"; break;
                case 'v': caracterCodificado = "AM"; break;
                case 'w': caracterCodificado = "AN"; break;
                case 'x': caracterCodificado = "AO"; break;
                case 'y': caracterCodificado = "AP"; break;
                case 'z': caracterCodificado = "AQ"; break;

                // Símbolos e pontuações
                case ' ': caracterCodificado = "BA"; break;
                case ',': caracterCodificado = "BB"; break;
                case '.': caracterCodificado = "BC"; break;
                case ';': caracterCodificado = "BD"; break;
                case ':': caracterCodificado = "BE"; break;
                case '+': caracterCodificado = "BF"; break;
                case '-': caracterCodificado = "BG"; break;
                case '/': caracterCodificado = "BH"; break;
                case '_': caracterCodificado = "BI"; break;

                // Vogais acentuadas - A
                case 'á': caracterCodificado = "BJ"; break;
                case 'â': caracterCodificado = "BK"; break;
                case 'ã': caracterCodificado = "BL"; break;
                case 'à': caracterCodificado = "BM"; break;

                // Vogais acentuadas - E
                case 'é': caracterCodificado = "BN"; break;
                case 'ê': caracterCodificado = "BO"; break;

                // Vogais acentuadas - I
                case 'í': caracterCodificado = "BP"; break;

                // Vogais acentuadas - O
                case 'ó': caracterCodificado = "BQ"; break;
                case 'ô': caracterCodificado = "BR"; break;
                case 'õ': caracterCodificado = "BS"; break;

                // Vogais acentuadas - U
                case 'ú': caracterCodificado = "BT"; break;
                case 'ü': caracterCodificado = "BU"; break;

                // Caso padrão, retorna o próprio caractere como string
                default: caracterCodificado = String.valueOf(caracter + "-"); break;
            }
        } else if (repeticao == 2) {
            switch (caracter) {
                // Letras do alfabeto
                case 'a': caracterCodificado = "21"; break;
                case 'b': caracterCodificado = "22"; break;
                case 'c': caracterCodificado = "23"; break;
                case 'd': caracterCodificado = "24"; break;
                case 'e': caracterCodificado = "25"; break;
                case 'f': caracterCodificado = "26"; break;
                case 'g': caracterCodificado = "27"; break;
                case 'h': caracterCodificado = "28"; break;
                case 'i': caracterCodificado = "29"; break;
                case 'j': caracterCodificado = "CA"; break;
                case 'k': caracterCodificado = "CB"; break;
                case 'l': caracterCodificado = "CC"; break;
                case 'm': caracterCodificado = "CD"; break;
                case 'n': caracterCodificado = "CE"; break;
                case 'o': caracterCodificado = "CF"; break;
                case 'p': caracterCodificado = "CG"; break;
                case 'q': caracterCodificado = "CH"; break;
                case 'r': caracterCodificado = "CI"; break;
                case 's': caracterCodificado = "CJ"; break;
                case 't': caracterCodificado = "CK"; break;
                case 'u': caracterCodificado = "CL"; break;
                case 'v': caracterCodificado = "CM"; break;
                case 'w': caracterCodificado = "CN"; break;
                case 'x': caracterCodificado = "CO"; break;
                case 'y': caracterCodificado = "CP"; break;
                case 'z': caracterCodificado = "CQ"; break;
                // Símbolos e pontuações
                case ' ': caracterCodificado = "DA"; break;
                case ',': caracterCodificado = "DB"; break;
                case '.': caracterCodificado = "DC"; break;
                case ';': caracterCodificado = "DD"; break;
                case ':': caracterCodificado = "DE"; break;
                case '+': caracterCodificado = "DF"; break;
                case '-': caracterCodificado = "DG"; break;
                case '/': caracterCodificado = "DH"; break;
                case '_': caracterCodificado = "DI"; break;
                // Vogais acentuadas - A
                case 'á': caracterCodificado = "DJ"; break;
                case 'â': caracterCodificado = "DK"; break;
                case 'ã': caracterCodificado = "DL"; break;
                case 'à': caracterCodificado = "DM"; break;

                // Vogais acentuadas - E
                case 'é': caracterCodificado = "DN"; break;
                case 'ê': caracterCodificado = "DO"; break;

                // Vogais acentuadas - I
                case 'í': caracterCodificado = "DP"; break;

                // Vogais acentuadas - O
                case 'ó': caracterCodificado = "DQ"; break;
                case 'ô': caracterCodificado = "DR"; break;
                case 'õ': caracterCodificado = "DS"; break;

                // Vogais acentuadas - U
                case 'ú': caracterCodificado = "DT"; break;
                case 'ü': caracterCodificado = "DU"; break;

                // Caso padrão, retorna o próprio caractere como string
                default: caracterCodificado = String.valueOf(caracter + "-"); break;
            }
        } else if (repeticao == 3) {
            switch (caracter) {
                // Letras do alfabeto
                case 'a': caracterCodificado = "31"; break; 
                case 'b': caracterCodificado = "32"; break; 
                case 'c': caracterCodificado = "33"; break; 
                case 'd': caracterCodificado = "34"; break; 
                case 'e': caracterCodificado = "35"; break; 
                case 'f': caracterCodificado = "36"; break; 
                case 'g': caracterCodificado = "37"; break; 
                case 'h': caracterCodificado = "38"; break; 
                case 'i': caracterCodificado = "39"; break; 
                case 'j': caracterCodificado = "DA"; break; 
                case 'k': caracterCodificado = "DB"; break; 
                case 'l': caracterCodificado = "DC"; break; 
                case 'm': caracterCodificado = "DD"; break; 
                case 'n': caracterCodificado = "DE"; break; 
                case 'o': caracterCodificado = "DF"; break; 
                case 'p': caracterCodificado = "DG"; break; 
                case 'q': caracterCodificado = "DH"; break; 
                case 'r': caracterCodificado = "DI"; break; 
                case 's': caracterCodificado = "DJ"; break; 
                case 't': caracterCodificado = "DK"; break; 
                case 'u': caracterCodificado = "DL"; break; 
                case 'v': caracterCodificado = "DM"; break; 
                case 'w': caracterCodificado = "DN"; break; 
                case 'x': caracterCodificado = "DO"; break; 
                case 'y': caracterCodificado = "DP"; break; 
                case 'z': caracterCodificado = "DQ"; break; 
                // Símbolos e pontuações
                case ' ': caracterCodificado = "EA"; break; 
                case ',': caracterCodificado = "EB"; break; 
                case '.': caracterCodificado = "EC"; break; 
                case ';': caracterCodificado = "ED"; break; 
                case ':': caracterCodificado = "EE"; break; 
                case '+': caracterCodificado = "EF"; break; 
                case '-': caracterCodificado = "EG"; break; 
                case '/': caracterCodificado = "EH"; break; 
                case '_': caracterCodificado = "EI"; break; 
                // Vogais acentuadas - A
                case 'á': caracterCodificado = "EJ"; break; 
                case 'â': caracterCodificado = "EK"; break; 
                case 'ã': caracterCodificado = "EL"; break; 
                case 'à': caracterCodificado = "EM"; break; 

                // Vogais acentuadas - E
                case 'é': caracterCodificado = "EN"; break; 
                case 'ê': caracterCodificado = "EO"; break; 

                // Vogais acentuadas - I
                case 'í': caracterCodificado = "EP"; break; 

                // Vogais acentuadas - O
                case 'ó': caracterCodificado = "EQ"; break; 
                case 'ô': caracterCodificado = "ER"; break; 
                case 'õ': caracterCodificado = "ES"; break; 

                // Vogais acentuadas - U
                case 'ú': caracterCodificado = "ET"; break; 
                case 'ü': caracterCodificado = "EU"; break; 

                // Caso padrão, retorna o próprio caractere como string
                default: caracterCodificado = String.valueOf(caracter + "-"); break;
            }
        } else if (repeticao == 4) {
            switch (caracter) {
                // Letras do alfabeto
                case 'a': caracterCodificado = "41"; break; 
                case 'b': caracterCodificado = "42"; break; 
                case 'c': caracterCodificado = "43"; break; 
                case 'd': caracterCodificado = "44"; break; 
                case 'e': caracterCodificado = "45"; break; 
                case 'f': caracterCodificado = "46"; break; 
                case 'g': caracterCodificado = "47"; break; 
                case 'h': caracterCodificado = "48"; break; 
                case 'i': caracterCodificado = "49"; break; 
                case 'j': caracterCodificado = "EA"; break; 
                case 'k': caracterCodificado = "EB"; break; 
                case 'l': caracterCodificado = "EC"; break; 
                case 'm': caracterCodificado = "ED"; break; 
                case 'n': caracterCodificado = "EE"; break; 
                case 'o': caracterCodificado = "EF"; break; 
                case 'p': caracterCodificado = "EG"; break; 
                case 'q': caracterCodificado = "EH"; break; 
                case 'r': caracterCodificado = "EI"; break; 
                case 's': caracterCodificado = "EJ"; break; 
                case 't': caracterCodificado = "EK"; break; 
                case 'u': caracterCodificado = "EL"; break; 
                case 'v': caracterCodificado = "EM"; break; 
                case 'w': caracterCodificado = "EN"; break; 
                case 'x': caracterCodificado = "EO"; break; 
                case 'y': caracterCodificado = "EP"; break; 
                case 'z': caracterCodificado = "EQ"; break; 
                // Símbolos e pontuações
                case ' ': caracterCodificado = "FA"; break; 
                case ',': caracterCodificado = "FB"; break; 
                case '.': caracterCodificado = "FC"; break; 
                case ';': caracterCodificado = "FD"; break; 
                case ':': caracterCodificado = "FE"; break; 
                case '+': caracterCodificado = "FF"; break; 
                case '-': caracterCodificado = "FG"; break; 
                case '/': caracterCodificado = "FH"; break; 
                case '_': caracterCodificado = "FI"; break; 
                // Vogais acentuadas - A
                case 'á': caracterCodificado = "FJ"; break; 
                case 'â': caracterCodificado = "FK"; break; 
                case 'ã': caracterCodificado = "FL"; break; 
                case 'à': caracterCodificado = "FM"; break; 

                // Vogais acentuadas - E
                case 'é': caracterCodificado = "FN"; break; 
                case 'ê': caracterCodificado = "FO"; break; 

                // Vogais acentuadas - I
                case 'í': caracterCodificado = "FP"; break; 

                // Vogais acentuadas - O
                case 'ó': caracterCodificado = "FQ"; break; 
                case 'ô': caracterCodificado = "FR"; break; 
                case 'õ': caracterCodificado = "FS"; break; 

                // Vogais acentuadas - U
                case 'ú': caracterCodificado = "FT"; break; 
                case 'ü': caracterCodificado = "FU"; break; 

                // Caso padrão, retorna o próprio caractere como string
                default: caracterCodificado = String.valueOf(caracter + "-"); break;
            }
        } else if (repeticao == 5) {
            switch (caracter) {
                // Letras do alfabeto
                case 'a': caracterCodificado = "51"; break; 
                case 'b': caracterCodificado = "52"; break; 
                case 'c': caracterCodificado = "53"; break; 
                case 'd': caracterCodificado = "54"; break; 
                case 'e': caracterCodificado = "55"; break; 
                case 'f': caracterCodificado = "56"; break; 
                case 'g': caracterCodificado = "57"; break; 
                case 'h': caracterCodificado = "58"; break; 
                case 'i': caracterCodificado = "59"; break; 
                case 'j': caracterCodificado = "FA"; break; 
                case 'k': caracterCodificado = "FB"; break; 
                case 'l': caracterCodificado = "FC"; break; 
                case 'm': caracterCodificado = "FD"; break; 
                case 'n': caracterCodificado = "FE"; break; 
                case 'o': caracterCodificado = "FF"; break; 
                case 'p': caracterCodificado = "FG"; break; 
                case 'q': caracterCodificado = "FH"; break; 
                case 'r': caracterCodificado = "FI"; break; 
                case 's': caracterCodificado = "FJ"; break; 
                case 't': caracterCodificado = "FK"; break; 
                case 'u': caracterCodificado = "FL"; break; 
                case 'v': caracterCodificado = "FM"; break; 
                case 'w': caracterCodificado = "FN"; break; 
                case 'x': caracterCodificado = "FO"; break; 
                case 'y': caracterCodificado = "FP"; break; 
                case 'z': caracterCodificado = "FQ"; break; 
                // Símbolos e pontuações
                case ' ': caracterCodificado = "GA"; break; 
                case ',': caracterCodificado = "GB"; break; 
                case '.': caracterCodificado = "GC"; break; 
                case ';': caracterCodificado = "GD"; break; 
                case ':': caracterCodificado = "GE"; break; 
                case '+': caracterCodificado = "GF"; break; 
                case '-': caracterCodificado = "GG"; break; 
                case '/': caracterCodificado = "GH"; break; 
                case '_': caracterCodificado = "GI"; break; 
                // Vogais acentuadas - A
                case 'á': caracterCodificado = "GJ"; break; 
                case 'â': caracterCodificado = "GK"; break; 
                case 'ã': caracterCodificado = "GL"; break; 
                case 'à': caracterCodificado = "GM"; break; 

                // Vogais acentuadas - E
                case 'é': caracterCodificado = "GN"; break; 
                case 'ê': caracterCodificado = "GO"; break; 

                // Vogais acentuadas - I
                case 'í': caracterCodificado = "GP"; break; 

                // Vogais acentuadas - O
                case 'ó': caracterCodificado = "GQ"; break; 
                case 'ô': caracterCodificado = "GR"; break; 
                case 'õ': caracterCodificado = "GS"; break; 

                // Vogais acentuadas - U
                case 'ú': caracterCodificado = "GT"; break; 
                case 'ü': caracterCodificado = "GU"; break; 

                // Caso padrão, retorna o próprio caractere como string
                default: caracterCodificado = String.valueOf(caracter + "-"); break;
            }
        }
        return caracterCodificado;
    }
    
    public char decodificar(String codigo, int repeticao) {
        char caracterDecodificado = ' ';
        if (repeticao == 1) {
            switch(codigo) {
                // Letras do alfabeto
                case "11" : caracterDecodificado = 'a'; break;
                case "12" : caracterDecodificado = 'b'; break;
                case "13" : caracterDecodificado = 'c'; break;
                case "14" : caracterDecodificado = 'd'; break;
                case "15" : caracterDecodificado = 'e'; break;
                case "16" : caracterDecodificado = 'f'; break;
                case "17" : caracterDecodificado = 'g'; break;
                case "18" : caracterDecodificado = 'h'; break;
                case "19" : caracterDecodificado = 'i'; break;
                case "AA" : caracterDecodificado = 'j'; break;
                case "AB" : caracterDecodificado = 'k'; break;
                case "AC" : caracterDecodificado = 'l'; break;
                case "AD" : caracterDecodificado = 'm'; break;
                case "AE" : caracterDecodificado = 'n'; break;
                case "AF" : caracterDecodificado = 'o'; break;
                case "AG" : caracterDecodificado = 'p'; break;
                case "AH" : caracterDecodificado = 'q'; break;
                case "AI" : caracterDecodificado = 'r'; break;
                case "AJ" : caracterDecodificado = 's'; break;
                case "AK" : caracterDecodificado = 't'; break;
                case "AL" : caracterDecodificado = 'u'; break;
                case "AM" : caracterDecodificado = 'v'; break;
                case "AN" : caracterDecodificado = 'w'; break;
                case "AO" : caracterDecodificado = 'x'; break;
                case "AP" : caracterDecodificado = 'y'; break;
                case "AQ" : caracterDecodificado = 'z'; break;
                
                // Símbolos e pontuações
                case "BA" : caracterDecodificado = ' '; break;
                case "BB" : caracterDecodificado = ','; break;
                case "BC" : caracterDecodificado = '.'; break;
                case "BD" : caracterDecodificado = ';'; break;
                case "BE" : caracterDecodificado = ':'; break;
                case "BF" : caracterDecodificado = '+'; break;
                case "BG" : caracterDecodificado = '-'; break;
                case "BH" : caracterDecodificado = '/'; break;
                case "BI" : caracterDecodificado = '_'; break;
                
                // Vogais acentuadas - A
                case "BJ" : caracterDecodificado = 'á'; break;
                case "BK" : caracterDecodificado = 'â'; break;
                case "BL" : caracterDecodificado = 'ã'; break;
                case "BM" : caracterDecodificado = 'à'; break;
                
                // Vogais acentuadas - E
                case "BN" : caracterDecodificado = 'é'; break;
                case "BO" : caracterDecodificado = 'ê'; break;
                
                
                // Vogais acentuadas - I
                case "BP" : caracterDecodificado = 'í'; break;
                
                 // Vogais acentuadas - O
                case "BQ" : caracterDecodificado = 'ó'; break;
                case "BR" : caracterDecodificado = 'ô'; break;
                case "BS" : caracterDecodificado = 'õ'; break;
                
                // Vogais acentuadas - U
                case "BT" : caracterDecodificado = 'ú'; break;
                case "BU" : caracterDecodificado = 'ü'; break;
                
                // Caso padrão, retorna o próprio caractere como string
                default: caracterDecodificado = codigo.charAt(0); break;
            }
        } else if (repeticao == 2) {
            switch(codigo) {
                // Letras do alfabeto
                case "21" : caracterDecodificado = 'a'; break;
                case "22" : caracterDecodificado = 'b'; break;
                case "23" : caracterDecodificado = 'c'; break;
                case "24" : caracterDecodificado = 'd'; break;
                case "25" : caracterDecodificado = 'e'; break;
                case "26" : caracterDecodificado = 'f'; break;
                case "27" : caracterDecodificado = 'g'; break;
                case "28" : caracterDecodificado = 'h'; break;
                case "29" : caracterDecodificado = 'i'; break;
                case "CA" : caracterDecodificado = 'j'; break;
                case "CB" : caracterDecodificado = 'k'; break;
                case "CC" : caracterDecodificado = 'l'; break;
                case "CD" : caracterDecodificado = 'm'; break;
                case "CE" : caracterDecodificado = 'n'; break;
                case "CF" : caracterDecodificado = 'o'; break;
                case "CG" : caracterDecodificado = 'p'; break;
                case "CH" : caracterDecodificado = 'q'; break;
                case "CI" : caracterDecodificado = 'r'; break;
                case "CJ" : caracterDecodificado = 's'; break;
                case "CK" : caracterDecodificado = 't'; break;
                case "CL" : caracterDecodificado = 'u'; break;
                case "CM" : caracterDecodificado = 'v'; break;
                case "CN" : caracterDecodificado = 'w'; break;
                case "CO" : caracterDecodificado = 'x'; break;
                case "CP" : caracterDecodificado = 'y'; break;
                case "CQ" : caracterDecodificado = 'z'; break;
                
                // Símbolos e pontuações
                case "DA" : caracterDecodificado = ' '; break;
                case "DB" : caracterDecodificado = ','; break;
                case "DC" : caracterDecodificado = '.'; break;
                case "DD" : caracterDecodificado = ';'; break;
                case "DE" : caracterDecodificado = ':'; break;
                case "DF" : caracterDecodificado = '+'; break;
                case "DG" : caracterDecodificado = '-'; break;
                case "DH" : caracterDecodificado = '/'; break;
                case "DI" : caracterDecodificado = '_'; break;
               
                // Vogais acentuadas - A
                case "DJ" : caracterDecodificado = 'á'; break;
                case "DK" : caracterDecodificado = 'â'; break;
                case "DL" : caracterDecodificado = 'ã'; break;
                case "DM" : caracterDecodificado = 'à'; break;
                
                // Vogais acentuadas - E
                case "DN" : caracterDecodificado = 'é'; break;
                case "DO" : caracterDecodificado = 'ê'; break;
                
                // Vogais acentuadas - I
                case "DP" : caracterDecodificado = 'í'; break;
                
                 // Vogais acentuadas - O
                case "DQ" : caracterDecodificado = 'ó'; break;
                case "DR" : caracterDecodificado = 'ô'; break;
                case "DS" : caracterDecodificado = 'õ'; break;
               
                // Vogais acentuadas - U
                case "DT" : caracterDecodificado = 'ú'; break;
                case "DU" : caracterDecodificado = 'ü'; break;
                
                // Caso padrão, retorna o próprio caractere como string
                default: caracterDecodificado = codigo.charAt(0); break;
            }
        } else if (repeticao == 3) {
            switch(codigo) {
                // Letras do alfabeto
                case "31" : caracterDecodificado = 'a'; break;
                case "32" : caracterDecodificado = 'b'; break;
                case "33" : caracterDecodificado = 'c'; break;
                case "34" : caracterDecodificado = 'd'; break;
                case "35" : caracterDecodificado = 'e'; break;
                case "36" : caracterDecodificado = 'f'; break;
                case "37" : caracterDecodificado = 'g'; break;
                case "38" : caracterDecodificado = 'h'; break;
                case "39" : caracterDecodificado = 'i'; break;
                case "DA" : caracterDecodificado = 'j'; break;
                case "DB" : caracterDecodificado = 'k'; break;
                case "DC" : caracterDecodificado = 'l'; break;
                case "DD" : caracterDecodificado = 'm'; break;
                case "DE" : caracterDecodificado = 'n'; break;
                case "DF" : caracterDecodificado = 'o'; break;
                case "DG" : caracterDecodificado = 'p'; break;
                case "DH" : caracterDecodificado = 'q'; break;
                case "DI" : caracterDecodificado = 'r'; break;
                case "DJ" : caracterDecodificado = 's'; break;
                case "DK" : caracterDecodificado = 't'; break;
                case "DL" : caracterDecodificado = 'u'; break;
                case "DM" : caracterDecodificado = 'v'; break;
                case "DN" : caracterDecodificado = 'w'; break;
                case "DO" : caracterDecodificado = 'x'; break;
                case "DP" : caracterDecodificado = 'y'; break;
                case "DQ" : caracterDecodificado = 'z'; break;
               
                // Símbolos e pontuações
                case "EA" : caracterDecodificado = ' '; break;
                case "EB" : caracterDecodificado = ','; break;
                case "EC" : caracterDecodificado = '.'; break;
                case "ED" : caracterDecodificado = ';'; break;
                case "EE" : caracterDecodificado = ':'; break;
                case "EF" : caracterDecodificado = '+'; break;
                case "EG" : caracterDecodificado = '-'; break;
                case "EH" : caracterDecodificado = '/'; break;
                case "EI" : caracterDecodificado = '_'; break;
              
                // Vogais acentuadas - A
                case "EJ" : caracterDecodificado = 'á'; break;
                case "EK" : caracterDecodificado = 'â'; break;
                case "EL" : caracterDecodificado = 'ã'; break;
                case "EM" : caracterDecodificado = 'à'; break;
                
                // Vogais acentuadas - E
                case "EN" : caracterDecodificado = 'é'; break;
                case "EO" : caracterDecodificado = 'ê'; break;
                
                // Vogais acentuadas - I
                case "EP" : caracterDecodificado = 'í'; break;
                
                 // Vogais acentuadas - O
                case "EQ" : caracterDecodificado = 'ó'; break;
                case "ER" : caracterDecodificado = 'ô'; break;
                case "ES" : caracterDecodificado = 'õ'; break;
               
                // Vogais acentuadas - U
                case "ET" : caracterDecodificado = 'ú'; break;
                case "EU" : caracterDecodificado = 'ü'; break;
                
                // Caso padrão, retorna o próprio caractere como string
                default: caracterDecodificado = codigo.charAt(0); break;
            }
        } else if (repeticao == 4) {
            switch(codigo) {
                // Letras do alfabeto
                case "41" : caracterDecodificado = 'a'; break;
                case "42" : caracterDecodificado = 'b'; break;
                case "43" : caracterDecodificado = 'c'; break;
                case "44" : caracterDecodificado = 'd'; break;
                case "45" : caracterDecodificado = 'e'; break;
                case "46" : caracterDecodificado = 'f'; break;
                case "47" : caracterDecodificado = 'g'; break;
                case "48" : caracterDecodificado = 'h'; break;
                case "49" : caracterDecodificado = 'i'; break;
                case "EA" : caracterDecodificado = 'j'; break;
                case "EB" : caracterDecodificado = 'k'; break;
                case "EC" : caracterDecodificado = 'l'; break;
                case "ED" : caracterDecodificado = 'm'; break;
                case "EE" : caracterDecodificado = 'n'; break;
                case "EF" : caracterDecodificado = 'o'; break;
                case "EG" : caracterDecodificado = 'p'; break;
                case "EH" : caracterDecodificado = 'q'; break;
                case "EI" : caracterDecodificado = 'r'; break;
                case "EJ" : caracterDecodificado = 's'; break;
                case "EK" : caracterDecodificado = 't'; break;
                case "EL" : caracterDecodificado = 'u'; break;
                case "EM" : caracterDecodificado = 'v'; break;
                case "EN" : caracterDecodificado = 'w'; break;
                case "EO" : caracterDecodificado = 'x'; break;
                case "EP" : caracterDecodificado = 'y'; break;
                case "EQ" : caracterDecodificado = 'z'; break;
               
                // Símbolos e pontuações
                case "FA" : caracterDecodificado = ' '; break;
                case "FB" : caracterDecodificado = ','; break;
                case "FC" : caracterDecodificado = '.'; break;
                case "FD" : caracterDecodificado = ';'; break;
                case "FE" : caracterDecodificado = ':'; break;
                case "FF" : caracterDecodificado = '+'; break;
                case "FG" : caracterDecodificado = '-'; break;
                case "FH" : caracterDecodificado = '/'; break;
                case "FI" : caracterDecodificado = '_'; break;
              
                // Vogais acentuadas - A
                case "FJ" : caracterDecodificado = 'á'; break;
                case "FK" : caracterDecodificado = 'â'; break;
                case "FL" : caracterDecodificado = 'ã'; break;
                case "FM" : caracterDecodificado = 'à'; break;
                
                // Vogais acentuadas - E
                case "FN" : caracterDecodificado = 'é'; break;
                case "FO" : caracterDecodificado = 'ê'; break;
               
                // Vogais acentuadas - I
                case "FP" : caracterDecodificado = 'í'; break;
                
                 // Vogais acentuadas - O
                case "FQ" : caracterDecodificado = 'ó'; break;
                case "FR" : caracterDecodificado = 'ô'; break;
                case "FS" : caracterDecodificado = 'õ'; break;
              
                // Vogais acentuadas - U
                case "FT" : caracterDecodificado = 'ú'; break;
                case "FU" : caracterDecodificado = 'ü'; break;
                
                // Caso padrão, retorna o próprio caractere como string
                default: caracterDecodificado = codigo.charAt(0); break;
            }
        } else if (repeticao == 5) {
            switch(codigo) {
                // Letras do alfabeto
                case "51" : caracterDecodificado = 'a'; break;
                case "52" : caracterDecodificado = 'b'; break;
                case "53" : caracterDecodificado = 'c'; break;
                case "54" : caracterDecodificado = 'd'; break;
                case "55" : caracterDecodificado = 'e'; break;
                case "56" : caracterDecodificado = 'f'; break;
                case "57" : caracterDecodificado = 'g'; break;
                case "58" : caracterDecodificado = 'h'; break;
                case "59" : caracterDecodificado = 'i'; break;
                case "FA" : caracterDecodificado = 'j'; break;
                case "FB" : caracterDecodificado = 'k'; break;
                case "FC" : caracterDecodificado = 'l'; break;
                case "FD" : caracterDecodificado = 'm'; break;
                case "FE" : caracterDecodificado = 'n'; break;
                case "FF" : caracterDecodificado = 'o'; break;
                case "FG" : caracterDecodificado = 'p'; break;
                case "FH" : caracterDecodificado = 'q'; break;
                case "FI" : caracterDecodificado = 'r'; break;
                case "FJ" : caracterDecodificado = 's'; break;
                case "FK" : caracterDecodificado = 't'; break;
                case "FL" : caracterDecodificado = 'u'; break;
                case "FM" : caracterDecodificado = 'v'; break;
                case "FN" : caracterDecodificado = 'w'; break;
                case "FO" : caracterDecodificado = 'x'; break;
                case "FP" : caracterDecodificado = 'y'; break;
                case "FQ" : caracterDecodificado = 'z'; break;
               
                // Símbolos e pontuações
                case "GA" : caracterDecodificado = ' '; break;
                case "GB" : caracterDecodificado = ','; break;
                case "GC" : caracterDecodificado = '.'; break;
                case "GD" : caracterDecodificado = ';'; break;
                case "GE" : caracterDecodificado = ':'; break;
                case "GF" : caracterDecodificado = '+'; break;
                case "GG" : caracterDecodificado = '-'; break;
                case "GH" : caracterDecodificado = '/'; break;
                case "GI" : caracterDecodificado = '_'; break;
              
                // Vogais acentuadas - A
                case "GJ" : caracterDecodificado = 'á'; break;
                case "GK" : caracterDecodificado = 'â'; break;
                case "GL" : caracterDecodificado = 'ã'; break;
                case "GM" : caracterDecodificado = 'à'; break;
                
                // Vogais acentuadas - E
                case "GN" : caracterDecodificado = 'é'; break;
                case "GO" : caracterDecodificado = 'ê'; break;
               
                // Vogais acentuadas - I
                case "GP" : caracterDecodificado = 'í'; break;
                
                 // Vogais acentuadas - O
                case "GQ" : caracterDecodificado = 'ó'; break;
                case "GR" : caracterDecodificado = 'ô'; break;
                case "GS" : caracterDecodificado = 'õ'; break;
              
                // Vogais acentuadas - U
                case "GT" : caracterDecodificado = 'ú'; break;
                case "GU" : caracterDecodificado = 'ü'; break;
                
                // Caso padrão, retorna o próprio caractere como string
                default: caracterDecodificado = codigo.charAt(0); break;
            }
        }
        return caracterDecodificado;
    }
    
    public String lerTexto(String texto) {
        String textoResposta = "";
        char caracter;
        String caracterCodificado;
        int rep = 1;
        
        for (int i = 0 ; i < texto.length() ; i++) {
            
            if (rep == 6) {
                rep = 1;
            }
            
            caracter = texto.charAt(i);
            caracterCodificado = codificar(caracter, rep);
            
            textoResposta += caracterCodificado;
            
            rep++;
        }
        return textoResposta;
    }
    
    public String lerCodigo(String textoCodificado) {
        String textoDecodificado = "";
        char caracterDecodificado;
        char caracterCodificadoUm;
        char caracterCodificadoDois;
        String duplaCaracteres;
        int rep = 1;
        
        for (int i = 0 ; i < textoCodificado.length() ; i += 2) {
            
            if (rep == 6) {
                rep = 1;
            }
            
            caracterCodificadoUm = textoCodificado.charAt(i);
            caracterCodificadoDois = textoCodificado.charAt(i + 1);
            duplaCaracteres = "" + caracterCodificadoUm + caracterCodificadoDois;
            
            caracterDecodificado = decodificar(duplaCaracteres, rep);
            
            textoDecodificado += caracterDecodificado;
            
            rep++;
        }
        return textoDecodificado;
    }
}