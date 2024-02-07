package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AggregatedInboundStatistics implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AggregatedInboundStatistics and sets the default values.
     */
    public AggregatedInboundStatistics() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AggregatedInboundStatistics
     */
    @jakarta.annotation.Nonnull
    public static AggregatedInboundStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AggregatedInboundStatistics();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the errors property value. The aggregate count of errors encountered by activities during this run.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getIntegerValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getIntegerValue()); });
        deserializerMap.put("matchedPeopleByRole", (n) -> { this.setMatchedPeopleByRole(n.getCollectionOfObjectValues(IndustryDataRunRoleCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("memberships", (n) -> { this.setMemberships(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizations", (n) -> { this.setOrganizations(n.getIntegerValue()); });
        deserializerMap.put("people", (n) -> { this.setPeople(n.getIntegerValue()); });
        deserializerMap.put("unmatchedPeopleByRole", (n) -> { this.setUnmatchedPeopleByRole(n.getCollectionOfObjectValues(IndustryDataRunRoleCountMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The aggregate count of active inbound groups processed during the run.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Gets the matchedPeopleByRole property value. The aggregate count of active people matched to a Microsoft Entra user, by role.
     * @return a java.util.List<IndustryDataRunRoleCountMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataRunRoleCountMetric> getMatchedPeopleByRole() {
        return this.backingStore.get("matchedPeopleByRole");
    }
    /**
     * Gets the memberships property value. The aggregate count of active inbound memberships processed during the run.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMemberships() {
        return this.backingStore.get("memberships");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the organizations property value. The aggregate count of active inbound organizations processed during the run.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOrganizations() {
        return this.backingStore.get("organizations");
    }
    /**
     * Gets the people property value. The aggregate count of active inbound people processed during the run.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPeople() {
        return this.backingStore.get("people");
    }
    /**
     * Gets the unmatchedPeopleByRole property value. The aggregate count of active people not matched to a Microsoft Entra user, by role.
     * @return a java.util.List<IndustryDataRunRoleCountMetric>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataRunRoleCountMetric> getUnmatchedPeopleByRole() {
        return this.backingStore.get("unmatchedPeopleByRole");
    }
    /**
     * Gets the warnings property value. The aggregate count of warnings generated by activities during this run.
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
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the errors property value. The aggregate count of errors encountered by activities during this run.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errors", value);
    }
    /**
     * Sets the groups property value. The aggregate count of active inbound groups processed during the run.
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("groups", value);
    }
    /**
     * Sets the matchedPeopleByRole property value. The aggregate count of active people matched to a Microsoft Entra user, by role.
     * @param value Value to set for the matchedPeopleByRole property.
     */
    public void setMatchedPeopleByRole(@jakarta.annotation.Nullable final java.util.List<IndustryDataRunRoleCountMetric> value) {
        this.backingStore.set("matchedPeopleByRole", value);
    }
    /**
     * Sets the memberships property value. The aggregate count of active inbound memberships processed during the run.
     * @param value Value to set for the memberships property.
     */
    public void setMemberships(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("memberships", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the organizations property value. The aggregate count of active inbound organizations processed during the run.
     * @param value Value to set for the organizations property.
     */
    public void setOrganizations(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("organizations", value);
    }
    /**
     * Sets the people property value. The aggregate count of active inbound people processed during the run.
     * @param value Value to set for the people property.
     */
    public void setPeople(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("people", value);
    }
    /**
     * Sets the unmatchedPeopleByRole property value. The aggregate count of active people not matched to a Microsoft Entra user, by role.
     * @param value Value to set for the unmatchedPeopleByRole property.
     */
    public void setUnmatchedPeopleByRole(@jakarta.annotation.Nullable final java.util.List<IndustryDataRunRoleCountMetric> value) {
        this.backingStore.set("unmatchedPeopleByRole", value);
    }
    /**
     * Sets the warnings property value. The aggregate count of warnings generated by activities during this run.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("warnings", value);
    }
}
