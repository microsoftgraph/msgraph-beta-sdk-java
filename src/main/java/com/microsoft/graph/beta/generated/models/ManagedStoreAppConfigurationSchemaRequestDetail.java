package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The request parameter for requesting Android Managed Play Store app configuration schema.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedStoreAppConfigurationSchemaRequestDetail extends AppConfigurationSchemaRequestDetail implements Parsable {
    /**
     * Instantiates a new {@link ManagedStoreAppConfigurationSchemaRequestDetail} and sets the default values.
     */
    public ManagedStoreAppConfigurationSchemaRequestDetail() {
        super();
        this.setOdataType("#microsoft.graph.managedStoreAppConfigurationSchemaRequestDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedStoreAppConfigurationSchemaRequestDetail}
     */
    @jakarta.annotation.Nonnull
    public static ManagedStoreAppConfigurationSchemaRequestDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedStoreAppConfigurationSchemaRequestDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("packageName", (n) -> { this.setPackageName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the packageName property value. The package name of the Android Managed Play Store app
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageName() {
        return this.backingStore.get("packageName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("packageName", this.getPackageName());
    }
    /**
     * Sets the packageName property value. The package name of the Android Managed Play Store app
     * @param value Value to set for the packageName property.
     */
    public void setPackageName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageName", value);
    }
}
