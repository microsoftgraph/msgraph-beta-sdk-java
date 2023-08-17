package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InsightsSettings extends Entity implements Parsable {
    /**
     * The ID of an Azure Active Directory group, of which the specified type of insights are disabled for its members. Default is empty. Optional.
     */
    private String disabledForGroup;
    /**
     * true if the specified type of insights are enabled for the organization; false if the specified type of insights are disabled for all users without exceptions. Default is true. Optional.
     */
    private Boolean isEnabledInOrganization;
    /**
     * Instantiates a new insightsSettings and sets the default values.
     */
    public InsightsSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a insightsSettings
     */
    @jakarta.annotation.Nonnull
    public static InsightsSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InsightsSettings();
    }
    /**
     * Gets the disabledForGroup property value. The ID of an Azure Active Directory group, of which the specified type of insights are disabled for its members. Default is empty. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisabledForGroup() {
        return this.disabledForGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("disabledForGroup", (n) -> { this.setDisabledForGroup(n.getStringValue()); });
        deserializerMap.put("isEnabledInOrganization", (n) -> { this.setIsEnabledInOrganization(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabledInOrganization property value. true if the specified type of insights are enabled for the organization; false if the specified type of insights are disabled for all users without exceptions. Default is true. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabledInOrganization() {
        return this.isEnabledInOrganization;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("disabledForGroup", this.getDisabledForGroup());
        writer.writeBooleanValue("isEnabledInOrganization", this.getIsEnabledInOrganization());
    }
    /**
     * Sets the disabledForGroup property value. The ID of an Azure Active Directory group, of which the specified type of insights are disabled for its members. Default is empty. Optional.
     * @param value Value to set for the disabledForGroup property.
     */
    public void setDisabledForGroup(@jakarta.annotation.Nullable final String value) {
        this.disabledForGroup = value;
    }
    /**
     * Sets the isEnabledInOrganization property value. true if the specified type of insights are enabled for the organization; false if the specified type of insights are disabled for all users without exceptions. Default is true. Optional.
     * @param value Value to set for the isEnabledInOrganization property.
     */
    public void setIsEnabledInOrganization(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabledInOrganization = value;
    }
}
