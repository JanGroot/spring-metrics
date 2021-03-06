package org.springframework.metrics.collector.spectator;

import org.springframework.metrics.collector.DistributionSummary;

public class SpectatorDistributionSummary implements DistributionSummary {
    private com.netflix.spectator.api.DistributionSummary distributionSummary;

    public SpectatorDistributionSummary(com.netflix.spectator.api.DistributionSummary distributionSummary) {
        this.distributionSummary = distributionSummary;
    }

    @Override
    public void record(long amount) {
        distributionSummary.record(amount);
    }

    @Override
    public long count() {
        return distributionSummary.count();
    }

    @Override
    public long totalAmount() {
        return distributionSummary.totalAmount();
    }
}
