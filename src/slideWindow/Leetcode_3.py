class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = 0
        char_index = {}
        left = 0
        for right, char in enumerate(s):
            if char in char_index and char_index[char] >= left:
                left = char_index[char]+1
                del char_index[char]
            char_index[char] = right
            max_len = max(max_len, right - left + 1)
        return max_len

if __name__ == "__main__":
    s = "abba"
    solution = Solution()
    print(solution.lengthOfLongestSubstring(s))
