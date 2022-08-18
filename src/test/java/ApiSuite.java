import api.negative.InvalidCredentialsTests;
import api.negative.InvalidValuesGetTransactionsTests;
import api.positive.ApiGetAccountsTest;
import api.positive.ApiGetTransactionsTest;
import api.positive.ApiLoginTest;
import api.positive.ApiRequestLoanTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        InvalidCredentialsTests.class,
        ApiLoginTest.class,
        ApiGetAccountsTest.class,
        ApiGetTransactionsTest.class,
        ApiRequestLoanTest.class,
        InvalidValuesGetTransactionsTests.class
})

public class ApiSuite {
}
