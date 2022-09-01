package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppProductCodeDetection extends Win32LobAppDetection implements Parsable {
    /** The product code of Win32 Line of Business (LoB) app. */
    private String _productCode;
    /** The product version of Win32 Line of Business (LoB) app. */
    private String _productVersion;
    /** Contains properties for detection operator. */
    private Win32LobAppDetectionOperator _productVersionOperator;
    /**
     * Instantiates a new Win32LobAppProductCodeDetection and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Win32LobAppProductCodeDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppProductCodeDetection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppProductCodeDetection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("productCode", (n) -> { currentObject.setProductCode(n.getStringValue()); });
            this.put("productVersion", (n) -> { currentObject.setProductVersion(n.getStringValue()); });
            this.put("productVersionOperator", (n) -> { currentObject.setProductVersionOperator(n.getEnumValue(Win32LobAppDetectionOperator.class)); });
        }};
    }
    /**
     * Gets the productCode property value. The product code of Win32 Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this._productCode;
    }
    /**
     * Gets the productVersion property value. The product version of Win32 Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this._productVersion;
    }
    /**
     * Gets the productVersionOperator property value. Contains properties for detection operator.
     * @return a win32LobAppDetectionOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppDetectionOperator getProductVersionOperator() {
        return this._productVersionOperator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this._productCode = value;
    }
    /**
     * Sets the productVersion property value. The product version of Win32 Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this._productVersion = value;
    }
    /**
     * Sets the productVersionOperator property value. Contains properties for detection operator.
     * @param value Value to set for the productVersionOperator property.
     * @return a void
     */
    public void setProductVersionOperator(@javax.annotation.Nullable final Win32LobAppDetectionOperator value) {
        this._productVersionOperator = value;
    }
}
