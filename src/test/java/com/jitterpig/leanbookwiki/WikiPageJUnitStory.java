package com.jitterpig.leanbookwiki;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;

/**
 *
 */
public abstract class WikiPageJUnitStory extends JUnitStory {
  @Override
  public Configuration configuration() {
    return new MostUsefulConfiguration()
            .useStoryLoader(new LoadFromClasspath(this.getClass()))
            .usePendingStepStrategy(new FailingUponPendingStep())
            .useStoryReporterBuilder(
                    new StoryReporterBuilder()
                            .withDefaultFormats()
                            .withFormats(Format.CONSOLE, Format.TXT));
  }

  @Override
  public List<CandidateSteps> candidateSteps() {
    return new InstanceStepsFactory(configuration(), storyStepsInstance()).createCandidateSteps();
  }

  protected abstract WikiSteps storyStepsInstance();

}
