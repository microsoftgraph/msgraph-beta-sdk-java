package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PeopleAdminSettings extends Entity implements Parsable {
    /**
     * The profileCardProperties property
     */
    private java.util.List<ProfileCardProperty> profileCardProperties;
    /**
     * Represents administrator settings that manage the support of pronouns in an organization.
     */
    private PronounsSettings pronouns;
    /**
     * Instantiates a new peopleAdminSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PeopleAdminSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a peopleAdminSettings
     */
    @javax.annotation.Nonnull
    public static PeopleAdminSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PeopleAdminSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("profileCardProperties", (n) -> { this.setProfileCardProperties(n.getCollectionOfObjectValues(ProfileCardProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("pronouns", (n) -> { this.setPronouns(n.getObjectValue(PronounsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the profileCardProperties property value. The profileCardProperties property
     * @return a profileCardProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ProfileCardProperty> getProfileCardProperties() {
        return this.profileCardProperties;
    }
    /**
     * Gets the pronouns property value. Represents administrator settings that manage the support of pronouns in an organization.
     * @return a pronounsSettings
     */
    @javax.annotation.Nullable
    public PronounsSettings getPronouns() {
        return this.pronouns;
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
        writer.writeCollectionOfObjectValues("profileCardProperties", this.getProfileCardProperties());
        writer.writeObjectValue("pronouns", this.getPronouns());
    }
    /**
     * Sets the profileCardProperties property value. The profileCardProperties property
     * @param value Value to set for the profileCardProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileCardProperties(@javax.annotation.Nullable final java.util.List<ProfileCardProperty> value) {
        this.profileCardProperties = value;
    }
    /**
     * Sets the pronouns property value. Represents administrator settings that manage the support of pronouns in an organization.
     * @param value Value to set for the pronouns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPronouns(@javax.annotation.Nullable final PronounsSettings value) {
        this.pronouns = value;
    }
}
