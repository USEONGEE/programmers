#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int main() {
    long long min, max;
    bool sieve[1000002];
    long long result = 0;
    // 데이터 읽기

    scanf("%lld %lld", &min, &max);

    // 모든 sieve를 1로 초기화
    for (long long i = 0; i < 1000002; i++) {
        sieve[i] = 1;
    }
    // ㄴㄴ 찾기
    for (long long i = 2; i <= sqrt(max); i++) {
        long long square = i * i;
        long long startIdx = (min - 1) / (square);
        for (long long j = startIdx * square + square; j <= max; j = j + square) { 
            sieve[j - min] = 0;
        }
    }
    
    for (long long i = 0; i <= max - min; i++) {
        result += sieve[i];
    }

    printf("%lld", result);
}