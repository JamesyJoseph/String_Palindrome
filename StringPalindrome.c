#include <stdio.h>
#include <string.h>

int main()
{
	char str[100];
	printf("Enter the String:");
	scanf("%s",&str);
	int left = 0;
	int right = strlen(str) - 1;

	while (left < right)
	{
		if(str[left] != str[right])
		{
			printf("%s is not palindrome.\n",str);
			return 0;
		}

		left++;
		right--;
	}

	printf("%s is palindrome.\n",str);
	return 0;
}
