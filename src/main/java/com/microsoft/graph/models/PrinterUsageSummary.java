package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterUsageSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The completedJobCount property */
    private Integer _completedJobCount;
    /** The incompleteJobCount property */
    private Integer _incompleteJobCount;
    /** The OdataType property */
    private String _odataType;
    /** The printer property */
    private DirectoryObject _printer;
    /** The printerDisplayName property */
    private String _printerDisplayName;
    /** The printerId property */
    private String _printerId;
    /** The printerManufacturer property */
    private String _printerManufacturer;
    /** The printerModel property */
    private String _printerModel;
    /**
     * Instantiates a new printerUsageSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrinterUsageSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerUsageSummary
     */
    @javax.annotation.Nonnull
    public static PrinterUsageSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterUsageSummary();
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
     * Gets the completedJobCount property value. The completedJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompletedJobCount() {
        return this._completedJobCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("completedJobCount", (n) -> { this.setCompletedJobCount(n.getIntegerValue()); });
        deserializerMap.put("incompleteJobCount", (n) -> { this.setIncompleteJobCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("printer", (n) -> { this.setPrinter(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("printerDisplayName", (n) -> { this.setPrinterDisplayName(n.getStringValue()); });
        deserializerMap.put("printerId", (n) -> { this.setPrinterId(n.getStringValue()); });
        deserializerMap.put("printerManufacturer", (n) -> { this.setPrinterManufacturer(n.getStringValue()); });
        deserializerMap.put("printerModel", (n) -> { this.setPrinterModel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIncompleteJobCount() {
        return this._incompleteJobCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the printer property value. The printer property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getPrinter() {
        return this._printer;
    }
    /**
     * Gets the printerDisplayName property value. The printerDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterDisplayName() {
        return this._printerDisplayName;
    }
    /**
     * Gets the printerId property value. The printerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterId() {
        return this._printerId;
    }
    /**
     * Gets the printerManufacturer property value. The printerManufacturer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterManufacturer() {
        return this._printerManufacturer;
    }
    /**
     * Gets the printerModel property value. The printerModel property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterModel() {
        return this._printerModel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("completedJobCount", this.getCompletedJobCount());
        writer.writeIntegerValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("printer", this.getPrinter());
        writer.writeStringValue("printerDisplayName", this.getPrinterDisplayName());
        writer.writeStringValue("printerId", this.getPrinterId());
        writer.writeStringValue("printerManufacturer", this.getPrinterManufacturer());
        writer.writeStringValue("printerModel", this.getPrinterModel());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the completedJobCount property value. The completedJobCount property
     * @param value Value to set for the completedJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedJobCount(@javax.annotation.Nullable final Integer value) {
        this._completedJobCount = value;
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompleteJobCount(@javax.annotation.Nullable final Integer value) {
        this._incompleteJobCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the printer property value. The printer property
     * @param value Value to set for the printer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinter(@javax.annotation.Nullable final DirectoryObject value) {
        this._printer = value;
    }
    /**
     * Sets the printerDisplayName property value. The printerDisplayName property
     * @param value Value to set for the printerDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterDisplayName(@javax.annotation.Nullable final String value) {
        this._printerDisplayName = value;
    }
    /**
     * Sets the printerId property value. The printerId property
     * @param value Value to set for the printerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterId(@javax.annotation.Nullable final String value) {
        this._printerId = value;
    }
    /**
     * Sets the printerManufacturer property value. The printerManufacturer property
     * @param value Value to set for the printerManufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterManufacturer(@javax.annotation.Nullable final String value) {
        this._printerManufacturer = value;
    }
    /**
     * Sets the printerModel property value. The printerModel property
     * @param value Value to set for the printerModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterModel(@javax.annotation.Nullable final String value) {
        this._printerModel = value;
    }
}
