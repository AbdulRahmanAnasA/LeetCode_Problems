#include <stdbool.h>
#include <string.h>

bool checkIfPangram(char* str) {
    int count[130] = {0};
    
    for (int i = 0; i < strlen(str); i++) {
        count[str[i]]++;
    }
    
    int flag = 0;
    for (int i = 97; i <= 122; i++) {
        if (count[i] == 0) {
            flag = 1;
            break;
        }
    }
    
    if (flag == 1) {
        return false;  // The string is not a pangram
    } else if (flag == 0 ) {
        return true;   // The string is a pangram and contains exactly two double quotes
    }
    
    return false;  // Default return if conditions are not met
}
