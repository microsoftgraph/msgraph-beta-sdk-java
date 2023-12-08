package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains product code and version properties to detect a Win32 App
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppProductCodeDetection extends Win32LobAppDetection implements Parsable {
    /**
     * Instantiates a new Win32LobAppProductCodeDetection and sets the default values.
     */
    public Win32LobAppProductCodeDetection() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppProductCodeDetection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppProductCodeDetection
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppProductCodeDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppProductCodeDetection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("productVersionOperator", (n) -> { this.setProductVersionOperator(n.getEnumSetValue(Win32LobAppDetectionOperator::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the productCode property value. The product code of Win32 Line of Business (LoB) app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductCode() {
        return this.backingStore.get("productCode");
    }
    /**
     * Gets the productVersion property value. The product version of Win32 Line of Business (LoB) app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductVersion() {
        return this.backingStore.get("productVersion");
    }
    /**
     * Gets the productVersionOperator property value. Contains properties for detection operator.
     * @return a EnumSet<Win32LobAppDetectionOperator>
     */
    @jakarta.annotation.Nullable
    public EnumSet<Win32LobAppDetectionOperator> getProductVersionOperator() {
        return this.backingStore.get("productVersionOperator");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeEnumSetValue("productVersionOperator", this.getProductVersionOperator());
    }
    /**
     * Sets the productCode property value. The product code of Win32 Line of Business (LoB) app.
     * @param value Value to set for the productCode property.
     */
    public void setProductCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productCode", value);
    }
    /**
     * Sets the productVersion property value. The product version of Win32 Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     */
    public void setProductVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productVersion", value);
    }
    /**
     * Sets the productVersionOperator property value. Contains properties for detection operator.
     * @param value Value to set for the productVersionOperator property.
     */
    public void setProductVersionOperator(@jakarta.annotation.Nullable final EnumSet<Win32LobAppDetectionOperator> value) {
        this.backingStore.set("productVersionOperator", value);
    }
}
