package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MonthlyUserInsightMetricsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MonthlyUserInsightMetricsRoot} and sets the default values.
     */
    public MonthlyUserInsightMetricsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MonthlyUserInsightMetricsRoot}
     */
    @jakarta.annotation.Nonnull
    public static MonthlyUserInsightMetricsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonthlyUserInsightMetricsRoot();
    }
    /**
     * Gets the activeUsers property value. Insights for active users on apps registered in the tenant for a specified period.
     * @return a {@link java.util.List<ActiveUsersMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActiveUsersMetric> getActiveUsers() {
        return this.backingStore.get("activeUsers");
    }
    /**
     * Gets the authentications property value. Insights for authentications on apps registered in the tenant for a specified period.
     * @return a {@link java.util.List<AuthenticationsMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationsMetric> getAuthentications() {
        return this.backingStore.get("authentications");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeUsers", (n) -> { this.setActiveUsers(n.getCollectionOfObjectValues(ActiveUsersMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("authentications", (n) -> { this.setAuthentications(n.getCollectionOfObjectValues(AuthenticationsMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("inactiveUsers", (n) -> { this.setInactiveUsers(n.getCollectionOfObjectValues(MonthlyInactiveUsersMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("inactiveUsersByApplication", (n) -> { this.setInactiveUsersByApplication(n.getCollectionOfObjectValues(MonthlyInactiveUsersByApplicationMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("mfaCompletions", (n) -> { this.setMfaCompletions(n.getCollectionOfObjectValues(MfaCompletionMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("mfaRegisteredUsers", (n) -> { this.setMfaRegisteredUsers(n.getCollectionOfObjectValues(MfaUserCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(UserRequestsMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("signUps", (n) -> { this.setSignUps(n.getCollectionOfObjectValues(UserSignUpMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getCollectionOfObjectValues(InsightSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inactiveUsers property value. The inactiveUsers property
     * @return a {@link java.util.List<MonthlyInactiveUsersMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MonthlyInactiveUsersMetric> getInactiveUsers() {
        return this.backingStore.get("inactiveUsers");
    }
    /**
     * Gets the inactiveUsersByApplication property value. The inactiveUsersByApplication property
     * @return a {@link java.util.List<MonthlyInactiveUsersByApplicationMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MonthlyInactiveUsersByApplicationMetric> getInactiveUsersByApplication() {
        return this.backingStore.get("inactiveUsersByApplication");
    }
    /**
     * Gets the mfaCompletions property value. Insights for MFA usage on apps registered in the tenant for a specified period.
     * @return a {@link java.util.List<MfaCompletionMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MfaCompletionMetric> getMfaCompletions() {
        return this.backingStore.get("mfaCompletions");
    }
    /**
     * Gets the mfaRegisteredUsers property value. The mfaRegisteredUsers property
     * @return a {@link java.util.List<MfaUserCountMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MfaUserCountMetric> getMfaRegisteredUsers() {
        return this.backingStore.get("mfaRegisteredUsers");
    }
    /**
     * Gets the requests property value. Insights for all user requests on apps registered in the tenant for a specified period.
     * @return a {@link java.util.List<UserRequestsMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserRequestsMetric> getRequests() {
        return this.backingStore.get("requests");
    }
    /**
     * Gets the signUps property value. Total sign-ups on apps registered in the tenant for a specified period.
     * @return a {@link java.util.List<UserSignUpMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSignUpMetric> getSignUps() {
        return this.backingStore.get("signUps");
    }
    /**
     * Gets the summary property value. Summary of all usage insights on apps registered in the tenant for a specified period.
     * @return a {@link java.util.List<InsightSummary>}
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
        writer.writeCollectionOfObjectValues("authentications", this.getAuthentications());
        writer.writeCollectionOfObjectValues("inactiveUsers", this.getInactiveUsers());
        writer.writeCollectionOfObjectValues("inactiveUsersByApplication", this.getInactiveUsersByApplication());
        writer.writeCollectionOfObjectValues("mfaCompletions", this.getMfaCompletions());
        writer.writeCollectionOfObjectValues("mfaRegisteredUsers", this.getMfaRegisteredUsers());
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
        writer.writeCollectionOfObjectValues("signUps", this.getSignUps());
        writer.writeCollectionOfObjectValues("summary", this.getSummary());
    }
    /**
     * Sets the activeUsers property value. Insights for active users on apps registered in the tenant for a specified period.
     * @param value Value to set for the activeUsers property.
     */
    public void setActiveUsers(@jakarta.annotation.Nullable final java.util.List<ActiveUsersMetric> value) {
        this.backingStore.set("activeUsers", value);
    }
    /**
     * Sets the authentications property value. Insights for authentications on apps registered in the tenant for a specified period.
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
     * Sets the mfaCompletions property value. Insights for MFA usage on apps registered in the tenant for a specified period.
     * @param value Value to set for the mfaCompletions property.
     */
    public void setMfaCompletions(@jakarta.annotation.Nullable final java.util.List<MfaCompletionMetric> value) {
        this.backingStore.set("mfaCompletions", value);
    }
    /**
     * Sets the mfaRegisteredUsers property value. The mfaRegisteredUsers property
     * @param value Value to set for the mfaRegisteredUsers property.
     */
    public void setMfaRegisteredUsers(@jakarta.annotation.Nullable final java.util.List<MfaUserCountMetric> value) {
        this.backingStore.set("mfaRegisteredUsers", value);
    }
    /**
     * Sets the requests property value. Insights for all user requests on apps registered in the tenant for a specified period.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<UserRequestsMetric> value) {
        this.backingStore.set("requests", value);
    }
    /**
     * Sets the signUps property value. Total sign-ups on apps registered in the tenant for a specified period.
     * @param value Value to set for the signUps property.
     */
    public void setSignUps(@jakarta.annotation.Nullable final java.util.List<UserSignUpMetric> value) {
        this.backingStore.set("signUps", value);
    }
    /**
     * Sets the summary property value. Summary of all usage insights on apps registered in the tenant for a specified period.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final java.util.List<InsightSummary> value) {
        this.backingStore.set("summary", value);
    }
}
