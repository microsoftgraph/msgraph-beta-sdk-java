package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The minimum operating system required for a MacOS app. */
public class MacOSMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Mac OS 10.10 or later. */
    private Boolean _v10_10;
    /** Mac OS 10.11 or later. */
    private Boolean _v10_11;
    /** Mac OS 10.12 or later. */
    private Boolean _v10_12;
    /** Mac OS 10.13 or later. */
    private Boolean _v10_13;
    /** Mac OS 10.14 or later. */
    private Boolean _v10_14;
    /** Mac OS 10.15 or later. */
    private Boolean _v10_15;
    /** Mac OS 10.7 or later. */
    private Boolean _v10_7;
    /** Mac OS 10.8 or later. */
    private Boolean _v10_8;
    /** Mac OS 10.9 or later. */
    private Boolean _v10_9;
    /** Mac OS 11.0 or later. */
    private Boolean _v11_0;
    /** Mac OS 12.0 or later. */
    private Boolean _v12_0;
    /**
     * Instantiates a new macOSMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    public MacOSMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static MacOSMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSMinimumOperatingSystem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSMinimumOperatingSystem currentObject = this;
        return new HashMap<>(11) {{
            this.put("v10_10", (n) -> { currentObject.setV10_10(n.getBooleanValue()); });
            this.put("v10_11", (n) -> { currentObject.setV10_11(n.getBooleanValue()); });
            this.put("v10_12", (n) -> { currentObject.setV10_12(n.getBooleanValue()); });
            this.put("v10_13", (n) -> { currentObject.setV10_13(n.getBooleanValue()); });
            this.put("v10_14", (n) -> { currentObject.setV10_14(n.getBooleanValue()); });
            this.put("v10_15", (n) -> { currentObject.setV10_15(n.getBooleanValue()); });
            this.put("v10_7", (n) -> { currentObject.setV10_7(n.getBooleanValue()); });
            this.put("v10_8", (n) -> { currentObject.setV10_8(n.getBooleanValue()); });
            this.put("v10_9", (n) -> { currentObject.setV10_9(n.getBooleanValue()); });
            this.put("v11_0", (n) -> { currentObject.setV11_0(n.getBooleanValue()); });
            this.put("v12_0", (n) -> { currentObject.setV12_0(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the v10_10 property value. Mac OS 10.10 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_10() {
        return this._v10_10;
    }
    /**
     * Gets the v10_11 property value. Mac OS 10.11 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_11() {
        return this._v10_11;
    }
    /**
     * Gets the v10_12 property value. Mac OS 10.12 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_12() {
        return this._v10_12;
    }
    /**
     * Gets the v10_13 property value. Mac OS 10.13 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_13() {
        return this._v10_13;
    }
    /**
     * Gets the v10_14 property value. Mac OS 10.14 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_14() {
        return this._v10_14;
    }
    /**
     * Gets the v10_15 property value. Mac OS 10.15 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_15() {
        return this._v10_15;
    }
    /**
     * Gets the v10_7 property value. Mac OS 10.7 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_7() {
        return this._v10_7;
    }
    /**
     * Gets the v10_8 property value. Mac OS 10.8 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_8() {
        return this._v10_8;
    }
    /**
     * Gets the v10_9 property value. Mac OS 10.9 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_9() {
        return this._v10_9;
    }
    /**
     * Gets the v11_0 property value. Mac OS 11.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV11_0() {
        return this._v11_0;
    }
    /**
     * Gets the v12_0 property value. Mac OS 12.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV12_0() {
        return this._v12_0;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("v10_10", this.getV10_10());
        writer.writeBooleanValue("v10_11", this.getV10_11());
        writer.writeBooleanValue("v10_12", this.getV10_12());
        writer.writeBooleanValue("v10_13", this.getV10_13());
        writer.writeBooleanValue("v10_14", this.getV10_14());
        writer.writeBooleanValue("v10_15", this.getV10_15());
        writer.writeBooleanValue("v10_7", this.getV10_7());
        writer.writeBooleanValue("v10_8", this.getV10_8());
        writer.writeBooleanValue("v10_9", this.getV10_9());
        writer.writeBooleanValue("v11_0", this.getV11_0());
        writer.writeBooleanValue("v12_0", this.getV12_0());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the v10_10 property value. Mac OS 10.10 or later.
     * @param value Value to set for the v10_10 property.
     * @return a void
     */
    public void setV10_10(@javax.annotation.Nullable final Boolean value) {
        this._v10_10 = value;
    }
    /**
     * Sets the v10_11 property value. Mac OS 10.11 or later.
     * @param value Value to set for the v10_11 property.
     * @return a void
     */
    public void setV10_11(@javax.annotation.Nullable final Boolean value) {
        this._v10_11 = value;
    }
    /**
     * Sets the v10_12 property value. Mac OS 10.12 or later.
     * @param value Value to set for the v10_12 property.
     * @return a void
     */
    public void setV10_12(@javax.annotation.Nullable final Boolean value) {
        this._v10_12 = value;
    }
    /**
     * Sets the v10_13 property value. Mac OS 10.13 or later.
     * @param value Value to set for the v10_13 property.
     * @return a void
     */
    public void setV10_13(@javax.annotation.Nullable final Boolean value) {
        this._v10_13 = value;
    }
    /**
     * Sets the v10_14 property value. Mac OS 10.14 or later.
     * @param value Value to set for the v10_14 property.
     * @return a void
     */
    public void setV10_14(@javax.annotation.Nullable final Boolean value) {
        this._v10_14 = value;
    }
    /**
     * Sets the v10_15 property value. Mac OS 10.15 or later.
     * @param value Value to set for the v10_15 property.
     * @return a void
     */
    public void setV10_15(@javax.annotation.Nullable final Boolean value) {
        this._v10_15 = value;
    }
    /**
     * Sets the v10_7 property value. Mac OS 10.7 or later.
     * @param value Value to set for the v10_7 property.
     * @return a void
     */
    public void setV10_7(@javax.annotation.Nullable final Boolean value) {
        this._v10_7 = value;
    }
    /**
     * Sets the v10_8 property value. Mac OS 10.8 or later.
     * @param value Value to set for the v10_8 property.
     * @return a void
     */
    public void setV10_8(@javax.annotation.Nullable final Boolean value) {
        this._v10_8 = value;
    }
    /**
     * Sets the v10_9 property value. Mac OS 10.9 or later.
     * @param value Value to set for the v10_9 property.
     * @return a void
     */
    public void setV10_9(@javax.annotation.Nullable final Boolean value) {
        this._v10_9 = value;
    }
    /**
     * Sets the v11_0 property value. Mac OS 11.0 or later.
     * @param value Value to set for the v11_0 property.
     * @return a void
     */
    public void setV11_0(@javax.annotation.Nullable final Boolean value) {
        this._v11_0 = value;
    }
    /**
     * Sets the v12_0 property value. Mac OS 12.0 or later.
     * @param value Value to set for the v12_0 property.
     * @return a void
     */
    public void setV12_0(@javax.annotation.Nullable final Boolean value) {
        this._v12_0 = value;
    }
}
