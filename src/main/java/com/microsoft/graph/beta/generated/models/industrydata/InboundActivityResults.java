package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InboundActivityResults extends IndustryDataActivityStatistics implements Parsable {
    /**
     * Instantiates a new InboundActivityResults and sets the default values.
     */
    public InboundActivityResults() {
        super();
        this.setOdataType("#microsoft.graph.industryData.inboundActivityResults");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InboundActivityResults
     */
    @jakarta.annotation.Nonnull
    public static InboundActivityResults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InboundActivityResults();
    }
    /**
     * Gets the errors property value. Number of errors encountered while processing the inbound flow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrors() {
        return this.backingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getIntegerValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getObjectValue(IndustryDataRunEntityCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("matchedPeopleByRole", (n) -> { this.setMatchedPeopleByRole(n.getCollectionOfObjectValues(IndustryDataRunRoleCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("memberships", (n) -> { this.setMemberships(n.getObjectValue(IndustryDataRunEntityCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("organizations", (n) -> { this.setOrganizations(n.getObjectValue(IndustryDataRunEntityCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("people", (n) -> { this.setPeople(n.getObjectValue(IndustryDataRunEntityCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("unmatchedPeopleByRole", (n) -> { this.setUnmatchedPeopleByRole(n.getCollectionOfObjectValues(IndustryDataRunRoleCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. Counts of active and inactive groups processed by the inbound flow.
     * @return a IndustryDataRunEntityCountMetric
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunEntityCountMetric getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Gets the matchedPeopleByRole property value. Number of people matched to a Microsoft Entra user, by role.
     * @return a java.util.List<IndustryDataRunRoleCountMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataRunRoleCountMetric> getMatchedPeopleByRole() {
        return this.backingStore.get("matchedPeopleByRole");
    }
    /**
     * Gets the memberships property value. Counts of active and inactive memberships processed by the inbound flow.
     * @return a IndustryDataRunEntityCountMetric
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunEntityCountMetric getMemberships() {
        return this.backingStore.get("memberships");
    }
    /**
     * Gets the organizations property value. Counts of active and inactive organizations processed by the inbound flow.
     * @return a IndustryDataRunEntityCountMetric
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunEntityCountMetric getOrganizations() {
        return this.backingStore.get("organizations");
    }
    /**
     * Gets the people property value. Counts of active and inactive people processed by the inbound flow.
     * @return a IndustryDataRunEntityCountMetric
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunEntityCountMetric getPeople() {
        return this.backingStore.get("people");
    }
    /**
     * Gets the unmatchedPeopleByRole property value. Number of people not matched to a Microsoft Entra user, by role.
     * @return a java.util.List<IndustryDataRunRoleCountMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataRunRoleCountMetric> getUnmatchedPeopleByRole() {
        return this.backingStore.get("unmatchedPeopleByRole");
    }
    /**
     * Gets the warnings property value. Number of warnings encountered while processing the inbound flow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWarnings() {
        return this.backingStore.get("warnings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the errors property value. Number of errors encountered while processing the inbound flow.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errors", value);
    }
    /**
     * Sets the groups property value. Counts of active and inactive groups processed by the inbound flow.
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.backingStore.set("groups", value);
    }
    /**
     * Sets the matchedPeopleByRole property value. Number of people matched to a Microsoft Entra user, by role.
     * @param value Value to set for the matchedPeopleByRole property.
     */
    public void setMatchedPeopleByRole(@jakarta.annotation.Nullable final java.util.List<IndustryDataRunRoleCountMetric> value) {
        this.backingStore.set("matchedPeopleByRole", value);
    }
    /**
     * Sets the memberships property value. Counts of active and inactive memberships processed by the inbound flow.
     * @param value Value to set for the memberships property.
     */
    public void setMemberships(@jakarta.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.backingStore.set("memberships", value);
    }
    /**
     * Sets the organizations property value. Counts of active and inactive organizations processed by the inbound flow.
     * @param value Value to set for the organizations property.
     */
    public void setOrganizations(@jakarta.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.backingStore.set("organizations", value);
    }
    /**
     * Sets the people property value. Counts of active and inactive people processed by the inbound flow.
     * @param value Value to set for the people property.
     */
    public void setPeople(@jakarta.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.backingStore.set("people", value);
    }
    /**
     * Sets the unmatchedPeopleByRole property value. Number of people not matched to a Microsoft Entra user, by role.
     * @param value Value to set for the unmatchedPeopleByRole property.
     */
    public void setUnmatchedPeopleByRole(@jakarta.annotation.Nullable final java.util.List<IndustryDataRunRoleCountMetric> value) {
        this.backingStore.set("unmatchedPeopleByRole", value);
    }
    /**
     * Sets the warnings property value. Number of warnings encountered while processing the inbound flow.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("warnings", value);
    }
}
