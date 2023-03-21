package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InboundActivityResults extends IndustryDataActivityStatistics implements Parsable {
    /** Number of errors encountered while processing the inbound flow. */
    private Integer errors;
    /** Counts of active and inactive groups processed by the inbound flow. */
    private IndustryDataRunEntityCountMetric groups;
    /** Number of people matched to an Azure Active Directory user, by role. */
    private java.util.List<IndustryDataRunRoleCountMetric> matchedPeopleByRole;
    /** Counts of active and inactive memberships processed by the inbound flow. */
    private IndustryDataRunEntityCountMetric memberships;
    /** Counts of active and inactive organizations processed by the inbound flow. */
    private IndustryDataRunEntityCountMetric organizations;
    /** Counts of active and inactive people processed by the inbound flow. */
    private IndustryDataRunEntityCountMetric people;
    /** Number of people not matched to an Azure Active Directory user, by role. */
    private java.util.List<IndustryDataRunRoleCountMetric> unmatchedPeopleByRole;
    /** Number of warnings encountered while processing the inbound flow. */
    private Integer warnings;
    /**
     * Instantiates a new InboundActivityResults and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InboundActivityResults() {
        super();
        this.setOdataType("#microsoft.graph.industryData.inboundActivityResults");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InboundActivityResults
     */
    @javax.annotation.Nonnull
    public static InboundActivityResults createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InboundActivityResults();
    }
    /**
     * Gets the errors property value. Number of errors encountered while processing the inbound flow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a industryDataRunEntityCountMetric
     */
    @javax.annotation.Nullable
    public IndustryDataRunEntityCountMetric getGroups() {
        return this.groups;
    }
    /**
     * Gets the matchedPeopleByRole property value. Number of people matched to an Azure Active Directory user, by role.
     * @return a industryDataRunRoleCountMetric
     */
    @javax.annotation.Nullable
    public java.util.List<IndustryDataRunRoleCountMetric> getMatchedPeopleByRole() {
        return this.matchedPeopleByRole;
    }
    /**
     * Gets the memberships property value. Counts of active and inactive memberships processed by the inbound flow.
     * @return a industryDataRunEntityCountMetric
     */
    @javax.annotation.Nullable
    public IndustryDataRunEntityCountMetric getMemberships() {
        return this.memberships;
    }
    /**
     * Gets the organizations property value. Counts of active and inactive organizations processed by the inbound flow.
     * @return a industryDataRunEntityCountMetric
     */
    @javax.annotation.Nullable
    public IndustryDataRunEntityCountMetric getOrganizations() {
        return this.organizations;
    }
    /**
     * Gets the people property value. Counts of active and inactive people processed by the inbound flow.
     * @return a industryDataRunEntityCountMetric
     */
    @javax.annotation.Nullable
    public IndustryDataRunEntityCountMetric getPeople() {
        return this.people;
    }
    /**
     * Gets the unmatchedPeopleByRole property value. Number of people not matched to an Azure Active Directory user, by role.
     * @return a industryDataRunRoleCountMetric
     */
    @javax.annotation.Nullable
    public java.util.List<IndustryDataRunRoleCountMetric> getUnmatchedPeopleByRole() {
        return this.unmatchedPeopleByRole;
    }
    /**
     * Gets the warnings property value. Number of warnings encountered while processing the inbound flow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the errors property value. Number of errors encountered while processing the inbound flow.
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final Integer value) {
        this.errors = value;
    }
    /**
     * Sets the groups property value. Counts of active and inactive groups processed by the inbound flow.
     * @param value Value to set for the groups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroups(@javax.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.groups = value;
    }
    /**
     * Sets the matchedPeopleByRole property value. Number of people matched to an Azure Active Directory user, by role.
     * @param value Value to set for the matchedPeopleByRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchedPeopleByRole(@javax.annotation.Nullable final java.util.List<IndustryDataRunRoleCountMetric> value) {
        this.matchedPeopleByRole = value;
    }
    /**
     * Sets the memberships property value. Counts of active and inactive memberships processed by the inbound flow.
     * @param value Value to set for the memberships property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberships(@javax.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.memberships = value;
    }
    /**
     * Sets the organizations property value. Counts of active and inactive organizations processed by the inbound flow.
     * @param value Value to set for the organizations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizations(@javax.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.organizations = value;
    }
    /**
     * Sets the people property value. Counts of active and inactive people processed by the inbound flow.
     * @param value Value to set for the people property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeople(@javax.annotation.Nullable final IndustryDataRunEntityCountMetric value) {
        this.people = value;
    }
    /**
     * Sets the unmatchedPeopleByRole property value. Number of people not matched to an Azure Active Directory user, by role.
     * @param value Value to set for the unmatchedPeopleByRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnmatchedPeopleByRole(@javax.annotation.Nullable final java.util.List<IndustryDataRunRoleCountMetric> value) {
        this.unmatchedPeopleByRole = value;
    }
    /**
     * Sets the warnings property value. Number of warnings encountered while processing the inbound flow.
     * @param value Value to set for the warnings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWarnings(@javax.annotation.Nullable final Integer value) {
        this.warnings = value;
    }
}
