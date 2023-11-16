package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupWritebackConfiguration extends WritebackConfiguration implements Parsable {
    /**
     * Instantiates a new GroupWritebackConfiguration and sets the default values.
     */
    public GroupWritebackConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupWritebackConfiguration
     */
    @jakarta.annotation.Nonnull
    public static GroupWritebackConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupWritebackConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onPremisesGroupType", (n) -> { this.setOnPremisesGroupType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the onPremisesGroupType property value. Indicates the target on-premises group type the cloud object is written back as. Nullable. The possible values are: universalDistributionGroup, universalSecurityGroup, universalMailEnabledSecurityGroup.If the cloud group is a unified (Microsoft 365) group, this property can be one of the following: universalDistributionGroup, universalSecurityGroup, universalMailEnabledSecurityGroup. Microsoft Entra security groups can be written back as universalSecurityGroup. If isEnabled or the NewUnifiedGroupWritebackDefault group setting is true but this property isn't explicitly configured: Microsoft 365 groups are written back as universalDistributionGroup by defaultSecurity groups are written back as universalSecurityGroup by default
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesGroupType() {
        return this.BackingStore.get("onPremisesGroupType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("onPremisesGroupType", this.getOnPremisesGroupType());
    }
    /**
     * Sets the onPremisesGroupType property value. Indicates the target on-premises group type the cloud object is written back as. Nullable. The possible values are: universalDistributionGroup, universalSecurityGroup, universalMailEnabledSecurityGroup.If the cloud group is a unified (Microsoft 365) group, this property can be one of the following: universalDistributionGroup, universalSecurityGroup, universalMailEnabledSecurityGroup. Microsoft Entra security groups can be written back as universalSecurityGroup. If isEnabled or the NewUnifiedGroupWritebackDefault group setting is true but this property isn't explicitly configured: Microsoft 365 groups are written back as universalDistributionGroup by defaultSecurity groups are written back as universalSecurityGroup by default
     * @param value Value to set for the onPremisesGroupType property.
     */
    public void setOnPremisesGroupType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("onPremisesGroupType", value);
    }
}
