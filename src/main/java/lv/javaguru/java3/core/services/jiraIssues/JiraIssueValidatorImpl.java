package lv.javaguru.java3.core.services.jiraIssues;

import lv.javaguru.java3.core.domain.Category;
import org.springframework.stereotype.Component;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.apache.commons.lang.StringUtils.isBlank;

/**
 * Created by Viesturs on 12-Nov-16.
 */
@Component
class JiraIssueValidatorImpl implements JiraIssueValidator {

    @Override
    public void validate(String description, Category category) {
        validateDescription(description);
        //validateCategory(category);
    }

    private void validateDescription(String description) {
        checkNotNull(description, "Description must not be null");
        checkArgument(!isBlank(description), "Description must not be empty");
    }

    private void validateCategory(Category category) {
        checkNotNull(category, "Category must not be null");
        checkArgument(!isBlank(category.toString()), "Category must not be empty");
    }

}
