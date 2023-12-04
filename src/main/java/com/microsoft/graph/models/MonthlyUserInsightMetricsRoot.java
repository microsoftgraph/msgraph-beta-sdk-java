package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MonthlyUserInsightMetricsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new MonthlyUserInsightMetricsRoot and sets the default values.
     */
    public MonthlyUserInsightMetricsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MonthlyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nonnull
    public static MonthlyUserInsightMetricsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonthlyUserInsightMetricsRoot();
    }
    /**
     * Gets the activeUsers property value. The activeUsers property
     * @return a java.util.List<ActiveUsersMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActiveUsersMetric> getActiveUsers() {
        return this.backingStore.get("activeUsers");
    }
    /**
     * Gets the activeUsersBreakdown property value. The activeUsersBreakdown property
     * @return a java.util.List<ActiveUsersBreakdownMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActiveUsersBreakdownMetric> getActiveUsersBreakdown() {
        return this.backingStore.get("activeUsersBreakdown");
    }
    /**
     * Gets the authentications property value. The authentications property
     * @return a java.util.List<AuthenticationsMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationsMetric> getAuthentications() {
        return this.backingStore.get("authentications");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeUsers", (n) -> { this.setActiveUsers(n.getCollectionOfObjectValues(ActiveUsersMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("activeUsersBreakdown", (n) -> { this.setActiveUsersBreakdown(n.getCollectionOfObjectValues(ActiveUsersBreakdownMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("authentications", (n) -> { this.setAuthentications(n.getCollectionOfObjectValues(AuthenticationsMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("inactiveUsers", (n) -> { this.setInactiveUsers(n.getCollectionOfObjectValues(MonthlyInactiveUsersMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("inactiveUsersByApplication", (n) -> { this.setInactiveUsersByApplication(n.getCollectionOfObjectValues(MonthlyInactiveUsersByApplicationMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("mfaCompletions", (n) -> { this.setMfaCompletions(n.getCollectionOfObjectValues(MfaCompletionMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(UserRequestsMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("signUps", (n) -> { this.setSignUps(n.getCollectionOfObjectValues(UserSignUpMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getCollectionOfObjectValues(InsightSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inactiveUsers property value. The inactiveUsers property
     * @return a java.util.List<MonthlyInactiveUsersMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MonthlyInactiveUsersMetric> getInactiveUsers() {
        return this.backingStore.get("inactiveUsers");
    }
    /**
     * Gets the inactiveUsersByApplication property value. The inactiveUsersByApplication property
     * @return a java.util.List<MonthlyInactiveUsersByApplicationMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MonthlyInactiveUsersByApplicationMetric> getInactiveUsersByApplication() {
        return this.backingStore.get("inactiveUsersByApplication");
    }
    /**
     * Gets the mfaCompletions property value. The mfaCompletions property
     * @return a java.util.List<MfaCompletionMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MfaCompletionMetric> getMfaCompletions() {
        return this.backingStore.get("mfaCompletions");
    }
    /**
     * Gets the requests property value. The requests property
     * @return a java.util.List<UserRequestsMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserRequestsMetric> getRequests() {
        return this.backingStore.get("requests");
    }
    /**
     * Gets the signUps property value. The signUps property
     * @return a java.util.List<UserSignUpMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSignUpMetric> getSignUps() {
        return this.backingStore.get("signUps");
    }
    /**
     * Gets the summary property value. The summary property
     * @return a java.util.List<InsightSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<InsightSummary> getSummary() {
        return this.backingStore.get("summary");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activeUsers", this.getActiveUsers());
        writer.writeCollectionOfObjectValues("activeUsersBreakdown", this.getActiveUsersBreakdown());
        writer.writeCollectionOfObjectValues("authentications", this.getAuthentications());
        writer.writeCollectionOfObjectValues("inactiveUsers", this.getInactiveUsers());
        writer.writeCollectionOfObjectValues("inactiveUsersByApplication", this.getInactiveUsersByApplication());
        writer.writeCollectionOfObjectValues("mfaCompletions", this.getMfaCompletions());
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
        writer.writeCollectionOfObjectValues("signUps", this.getSignUps());
        writer.writeCollectionOfObjectValues("summary", this.getSummary());
    }
    /**
     * Sets the activeUsers property value. The activeUsers property
     * @param value Value to set for the activeUsers property.
     */
    public void setActiveUsers(@jakarta.annotation.Nullable final java.util.List<ActiveUsersMetric> value) {
        this.backingStore.set("activeUsers", value);
    }
    /**
     * Sets the activeUsersBreakdown property value. The activeUsersBreakdown property
     * @param value Value to set for the activeUsersBreakdown property.
     */
    public void setActiveUsersBreakdown(@jakarta.annotation.Nullable final java.util.List<ActiveUsersBreakdownMetric> value) {
        this.backingStore.set("activeUsersBreakdown", value);
    }
    /**
     * Sets the authentications property value. The authentications property
     * @param value Value to set for the authentications property.
     */
    public void setAuthentications(@jakarta.annotation.Nullable final java.util.List<AuthenticationsMetric> value) {
        this.backingStore.set("authentications", value);
    }
    /**
     * Sets the inactiveUsers property value. The inactiveUsers property
     * @param value Value to set for the inactiveUsers property.
     */
    public void setInactiveUsers(@jakarta.annotation.Nullable final java.util.List<MonthlyInactiveUsersMetric> value) {
        this.backingStore.set("inactiveUsers", value);
    }
    /**
     * Sets the inactiveUsersByApplication property value. The inactiveUsersByApplication property
     * @param value Value to set for the inactiveUsersByApplication property.
     */
    public void setInactiveUsersByApplication(@jakarta.annotation.Nullable final java.util.List<MonthlyInactiveUsersByApplicationMetric> value) {
        this.backingStore.set("inactiveUsersByApplication", value);
    }
    /**
     * Sets the mfaCompletions property value. The mfaCompletions property
     * @param value Value to set for the mfaCompletions property.
     */
    public void setMfaCompletions(@jakarta.annotation.Nullable final java.util.List<MfaCompletionMetric> value) {
        this.backingStore.set("mfaCompletions", value);
    }
    /**
     * Sets the requests property value. The requests property
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<UserRequestsMetric> value) {
        this.backingStore.set("requests", value);
    }
    /**
     * Sets the signUps property value. The signUps property
     * @param value Value to set for the signUps property.
     */
    public void setSignUps(@jakarta.annotation.Nullable final java.util.List<UserSignUpMetric> value) {
        this.backingStore.set("signUps", value);
    }
    /**
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final java.util.List<InsightSummary> value) {
        this.backingStore.set("summary", value);
    }
}
