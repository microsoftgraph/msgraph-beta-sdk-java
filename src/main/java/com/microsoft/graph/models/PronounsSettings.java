package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PronounsSettings extends Entity implements Parsable {
    /**
     * true to enable pronouns in the organization, false otherwise. The default is false, and pronouns are disabled.
     */
    private Boolean isEnabledInOrganization;
    /**
     * Instantiates a new pronounsSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PronounsSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pronounsSettings
     */
    @javax.annotation.Nonnull
    public static PronounsSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PronounsSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isEnabledInOrganization", (n) -> { this.setIsEnabledInOrganization(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabledInOrganization property value. true to enable pronouns in the organization, false otherwise. The default is false, and pronouns are disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabledInOrganization() {
        return this.isEnabledInOrganization;
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
        writer.writeBooleanValue("isEnabledInOrganization", this.getIsEnabledInOrganization());
    }
    /**
     * Sets the isEnabledInOrganization property value. true to enable pronouns in the organization, false otherwise. The default is false, and pronouns are disabled.
     * @param value Value to set for the isEnabledInOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabledInOrganization(@javax.annotation.Nullable final Boolean value) {
        this.isEnabledInOrganization = value;
    }
}
