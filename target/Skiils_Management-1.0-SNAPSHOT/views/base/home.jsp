<section id="banner">
    <ul class="actions">

        <sec:authorize access="!isAuthenticated()"><li>
            <a href="/registration" class="button big">Register</a>
        </li>

            <sec:authorize access="!isAuthenticated()"> <li>
                <a href="/loginpage">Sign in</a>
            </li>
        </sec:authorize>

        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <a href="/admin" class="button big">Admin</a>
        </sec:authorize>

    </ul>
    <button class="btn-primary">lala</button>
</section>