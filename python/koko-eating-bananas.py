class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        #guards will come back in h hours.
        #per-hour eating speed of k
        #Eğer yığında k'dan az muz varsa, hepsini yer ve bu saat içinde daha fazla muz yemez.
        #Return the minimum integer k such that she can eat all the bananas within h hours.
        #piles.length <= h

        #k between 1 and max num
        left, right = 1, max(piles)
        if len(piles) == h:
            return right

        answer = right
        while left <= right:
            mid = left + int((right - left) / 2)
            if self.possible(mid,piles,h):
                answer = mid
                right = mid-1
            else:
                left = mid +1
        return answer

        
    def possible(self,k,piles,h):
        result = 0
        for pile in piles:
            result += int(pile / k)
            if pile % k != 0:
                result += 1
        return result <= h
