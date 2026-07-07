package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DistributionList extends OutlookItem implements Parsable {
    /**
     * Instantiates a new {@link DistributionList} and sets the default values.
     */
    public DistributionList() {
        super();
        this.setOdataType("#microsoft.graph.distributionList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DistributionList}
     */
    @jakarta.annotation.Nonnull
    public static DistributionList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DistributionList();
    }
    /**
     * Gets the displayName property value. The display name of the distribution list.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the distributionListMembers property value. The expanded members of the distribution list. Each member contains detailed information including resolved email addresses. Read-only.
     * @return a {@link java.util.List<DistributionListMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DistributionListMember> getDistributionListMembers() {
        return this.backingStore.get("distributionListMembers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("distributionListMembers", (n) -> { this.setDistributionListMembers(n.getCollectionOfObjectValues(DistributionListMember::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(Member::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("personIdentifier", (n) -> { this.setPersonIdentifier(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. The list of members in the distribution list. Not returned by default; use $select=members to include.
     * @return a {@link java.util.List<Member>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Member> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the notes property value. The notes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the personIdentifier property value. The personIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonIdentifier() {
        return this.backingStore.get("personIdentifier");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The singleValueExtendedProperties property
     * @return a {@link java.util.List<SingleValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("distributionListMembers", this.getDistributionListMembers());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("personIdentifier", this.getPersonIdentifier());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
    }
    /**
     * Sets the displayName property value. The display name of the distribution list.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the distributionListMembers property value. The expanded members of the distribution list. Each member contains detailed information including resolved email addresses. Read-only.
     * @param value Value to set for the distributionListMembers property.
     */
    public void setDistributionListMembers(@jakarta.annotation.Nullable final java.util.List<DistributionListMember> value) {
        this.backingStore.set("distributionListMembers", value);
    }
    /**
     * Sets the members property value. The list of members in the distribution list. Not returned by default; use $select=members to include.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<Member> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the personIdentifier property value. The personIdentifier property
     * @param value Value to set for the personIdentifier property.
     */
    public void setPersonIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personIdentifier", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The singleValueExtendedProperties property
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
}
