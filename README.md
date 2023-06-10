# Bankkonto-projekt

Det här projektet innehåller en klass för en bankkonto samt en testklass som testar bankkonto-klassens metoder.

## Bankkonto-klass

`Bankkonto`-klassen implementerar grundläggande funktioner för ett bankkonto, inklusive insättningar, uttag och kontoinformation. Klassen är skriven i [Java], och dess metoder inkluderar:

- `sätt_in(self, belopp)` - Sätter in det angivna beloppet på bankkontot.
- `ta_ut(self, belopp)` - Gör ett uttag från bankkontot med det angivna beloppet.
- `visa_saldo(self)` - Returnerar det aktuella saldot på bankkontot.
## Librares
- junit.jupiter

## Testklass

`TestBankkonto`-klassen är en testklass som testar funktionerna i `Bankkonto`-klassen. Testklassen testar följande metoder:

- `test_sätt_in()` - Testar `sätt_in`-metoden genom att sätta in ett belopp och verifiera att saldot har ökat korrekt, att inte går sätta null eller minder än 1.
- `test_ta_ut()` - Testar `ta_ut`-metoden genom att göra ett uttag och verifiera att saldot minskar korrekt, att inte går ta ut mer än saldo eller mindre än 1.
- `test_visa_saldo()` - Testar `visa_saldo`-metoden genom att kontrollera att det returnerade saldot är korrekt.

## Användning

För att använda `Bankkonto`-klassen och köra testerna med `TestBankkonto`-klassen, följ dessa steg:

1. Ladda ner projektet från [https://github.com/AhmadAlhayel/firstTest.git].
2. Öppna filen `bankkonto.py` för att visa koden för `Bankkonto`-klassen.
3. Skapa en instans av `Bankkonto`-klassen och använd dess metoder för att interagera med bankkontot.
4. För att köra testerna, öppna filen `test_bankkonto.py` för att visa koden för `TestBankkonto`-klassen.
