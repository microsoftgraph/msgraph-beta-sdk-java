package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationSystem extends Entity implements Parsable {
    /**
     * Instantiates a new AuthorizationSystem and sets the default values.
     */
    public AuthorizationSystem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthorizationSystem
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsAuthorizationSystem": return new AwsAuthorizationSystem();
                case "#microsoft.graph.azureAuthorizationSystem": return new AzureAuthorizationSystem();
                case "#microsoft.graph.gcpAuthorizationSystem": return new GcpAuthorizationSystem();
            }
        }
        return new AuthorizationSystem();
    }
    /**
     * Gets the authorizationSystemId property value. The authorizationSystemId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthorizationSystemId() {
        return this.BackingStore.get("authorizationSystemId");
    }
    /**
     * Gets the authorizationSystemName property value. The authorizationSystemName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthorizationSystemName() {
        return this.BackingStore.get("authorizationSystemName");
    }
    /**
     * Gets the authorizationSystemType property value. The authorizationSystemType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthorizationSystemType() {
        return this.BackingStore.get("authorizationSystemType");
    }
    /**
     * Gets the dataCollectionInfo property value. The dataCollectionInfo property
     * @return a DataCollectionInfo
     */
    @jakarta.annotation.Nullable
    public DataCollectionInfo getDataCollectionInfo() {
        return this.BackingStore.get("dataCollectionInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorizationSystemId", (n) -> { this.setAuthorizationSystemId(n.getStringValue()); });
        deserializerMap.put("authorizationSystemName", (n) -> { this.setAuthorizationSystemName(n.getStringValue()); });
        deserializerMap.put("authorizationSystemType", (n) -> { this.setAuthorizationSystemType(n.getStringValue()); });
        deserializerMap.put("dataCollectionInfo", (n) -> { this.setDataCollectionInfo(n.getObjectValue(DataCollectionInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authorizationSystemId", this.getAuthorizationSystemId());
        writer.writeStringValue("authorizationSystemName", this.getAuthorizationSystemName());
        writer.writeStringValue("authorizationSystemType", this.getAuthorizationSystemType());
        writer.writeObjectValue("dataCollectionInfo", this.getDataCollectionInfo());
    }
    /**
     * Sets the authorizationSystemId property value. The authorizationSystemId property
     * @param value Value to set for the authorizationSystemId property.
     */
    public void setAuthorizationSystemId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("authorizationSystemId", value);
    }
    /**
     * Sets the authorizationSystemName property value. The authorizationSystemName property
     * @param value Value to set for the authorizationSystemName property.
     */
    public void setAuthorizationSystemName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("authorizationSystemName", value);
    }
    /**
     * Sets the authorizationSystemType property value. The authorizationSystemType property
     * @param value Value to set for the authorizationSystemType property.
     */
    public void setAuthorizationSystemType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("authorizationSystemType", value);
    }
    /**
     * Sets the dataCollectionInfo property value. The dataCollectionInfo property
     * @param value Value to set for the dataCollectionInfo property.
     */
    public void setDataCollectionInfo(@jakarta.annotation.Nullable final DataCollectionInfo value) {
        this.BackingStore.set("dataCollectionInfo", value);
    }
}
