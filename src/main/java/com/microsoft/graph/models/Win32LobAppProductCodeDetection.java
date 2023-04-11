package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppProductCodeDetection extends Win32LobAppDetection implements Parsable {
    /** The product code of Win32 Line of Business (LoB) app. */
    private String productCode;
    /** The product version of Win32 Line of Business (LoB) app. */
    private String productVersion;
    /** Contains properties for detection operator. */
    private Win32LobAppDetectionOperator productVersionOperator;
    /**
     * Instantiates a new Win32LobAppProductCodeDetection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppProductCodeDetection() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppProductCodeDetection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppProductCodeDetection
     */
    @javax.annotation.Nonnull
    public static Win32LobAppProductCodeDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppProductCodeDetection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("productVersionOperator", (n) -> { this.setProductVersionOperator(n.getEnumValue(Win32LobAppDetectionOperator.class)); });
        return deserializerMap;
    }
    /**
     * Gets the productCode property value. The product code of Win32 Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this.productCode;
    }
    /**
     * Gets the productVersion property value. The product version of Win32 Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this.productVersion;
    }
    /**
     * Gets the productVersionOperator property value. Contains properties for detection operator.
     * @return a win32LobAppDetectionOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppDetectionOperator getProductVersionOperator() {
        return this.productVersionOperator;
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
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeEnumValue("productVersionOperator", this.getProductVersionOperator());
    }
    /**
     * Sets the productCode property value. The product code of Win32 Line of Business (LoB) app.
     * @param value Value to set for the productCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this.productCode = value;
    }
    /**
     * Sets the productVersion property value. The product version of Win32 Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this.productVersion = value;
    }
    /**
     * Sets the productVersionOperator property value. Contains properties for detection operator.
     * @param value Value to set for the productVersionOperator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductVersionOperator(@javax.annotation.Nullable final Win32LobAppDetectionOperator value) {
        this.productVersionOperator = value;
    }
}
