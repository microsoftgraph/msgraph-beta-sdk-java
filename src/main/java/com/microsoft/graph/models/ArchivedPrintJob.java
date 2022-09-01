package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ArchivedPrintJob implements AdditionalDataHolder, Parsable {
    /** True if the job was acquired by a printer; false otherwise. Read-only. */
    private Boolean _acquiredByPrinter;
    /** The dateTimeOffset when the job was acquired by the printer, if any. Read-only. */
    private OffsetDateTime _acquiredDateTime;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of black and white pages that were printed. Read-only. */
    private Integer _blackAndWhitePageCount;
    /** The number of color pages that were printed. Read-only. */
    private Integer _colorPageCount;
    /** The dateTimeOffset when the job was completed, canceled or aborted. Read-only. */
    private OffsetDateTime _completionDateTime;
    /** The number of copies that were printed. Read-only. */
    private Integer _copiesPrinted;
    /** The user who created the print job. Read-only. */
    private UserIdentity _createdBy;
    /** The dateTimeOffset when the job was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The number of duplex (double-sided) pages that were printed. Read-only. */
    private Integer _duplexPageCount;
    /** The archived print job's GUID. Read-only. */
    private String _id;
    /** The OdataType property */
    private String _odataType;
    /** The total number of pages that were printed. Read-only. */
    private Integer _pageCount;
    /** The printer ID that the job was queued for. Read-only. */
    private String _printerId;
    /** The processingState property */
    private PrintJobProcessingState _processingState;
    /** The number of simplex (single-sided) pages that were printed. Read-only. */
    private Integer _simplexPageCount;
    /**
     * Instantiates a new archivedPrintJob and sets the default values.
     * @return a void
     */
    public ArchivedPrintJob() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.archivedPrintJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a archivedPrintJob
     */
    @javax.annotation.Nonnull
    public static ArchivedPrintJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArchivedPrintJob();
    }
    /**
     * Gets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAcquiredByPrinter() {
        return this._acquiredByPrinter;
    }
    /**
     * Gets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAcquiredDateTime() {
        return this._acquiredDateTime;
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
     * Gets the blackAndWhitePageCount property value. The number of black and white pages that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlackAndWhitePageCount() {
        return this._blackAndWhitePageCount;
    }
    /**
     * Gets the colorPageCount property value. The number of color pages that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColorPageCount() {
        return this._colorPageCount;
    }
    /**
     * Gets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this._completionDateTime;
    }
    /**
     * Gets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCopiesPrinted() {
        return this._copiesPrinted;
    }
    /**
     * Gets the createdBy property value. The user who created the print job. Read-only.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the duplexPageCount property value. The number of duplex (double-sided) pages that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDuplexPageCount() {
        return this._duplexPageCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ArchivedPrintJob currentObject = this;
        return new HashMap<>(15) {{
            this.put("acquiredByPrinter", (n) -> { currentObject.setAcquiredByPrinter(n.getBooleanValue()); });
            this.put("acquiredDateTime", (n) -> { currentObject.setAcquiredDateTime(n.getOffsetDateTimeValue()); });
            this.put("blackAndWhitePageCount", (n) -> { currentObject.setBlackAndWhitePageCount(n.getIntegerValue()); });
            this.put("colorPageCount", (n) -> { currentObject.setColorPageCount(n.getIntegerValue()); });
            this.put("completionDateTime", (n) -> { currentObject.setCompletionDateTime(n.getOffsetDateTimeValue()); });
            this.put("copiesPrinted", (n) -> { currentObject.setCopiesPrinted(n.getIntegerValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("duplexPageCount", (n) -> { currentObject.setDuplexPageCount(n.getIntegerValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("pageCount", (n) -> { currentObject.setPageCount(n.getIntegerValue()); });
            this.put("printerId", (n) -> { currentObject.setPrinterId(n.getStringValue()); });
            this.put("processingState", (n) -> { currentObject.setProcessingState(n.getEnumValue(PrintJobProcessingState.class)); });
            this.put("simplexPageCount", (n) -> { currentObject.setSimplexPageCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the id property value. The archived print job's GUID. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
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
     * Gets the pageCount property value. The total number of pages that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPageCount() {
        return this._pageCount;
    }
    /**
     * Gets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterId() {
        return this._printerId;
    }
    /**
     * Gets the processingState property value. The processingState property
     * @return a printJobProcessingState
     */
    @javax.annotation.Nullable
    public PrintJobProcessingState getProcessingState() {
        return this._processingState;
    }
    /**
     * Gets the simplexPageCount property value. The number of simplex (single-sided) pages that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSimplexPageCount() {
        return this._simplexPageCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acquiredByPrinter", this.getAcquiredByPrinter());
        writer.writeOffsetDateTimeValue("acquiredDateTime", this.getAcquiredDateTime());
        writer.writeIntegerValue("blackAndWhitePageCount", this.getBlackAndWhitePageCount());
        writer.writeIntegerValue("colorPageCount", this.getColorPageCount());
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeIntegerValue("copiesPrinted", this.getCopiesPrinted());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("duplexPageCount", this.getDuplexPageCount());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pageCount", this.getPageCount());
        writer.writeStringValue("printerId", this.getPrinterId());
        writer.writeEnumValue("processingState", this.getProcessingState());
        writer.writeIntegerValue("simplexPageCount", this.getSimplexPageCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @param value Value to set for the acquiredByPrinter property.
     * @return a void
     */
    public void setAcquiredByPrinter(@javax.annotation.Nullable final Boolean value) {
        this._acquiredByPrinter = value;
    }
    /**
     * Sets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @param value Value to set for the acquiredDateTime property.
     * @return a void
     */
    public void setAcquiredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._acquiredDateTime = value;
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
     * Sets the blackAndWhitePageCount property value. The number of black and white pages that were printed. Read-only.
     * @param value Value to set for the blackAndWhitePageCount property.
     * @return a void
     */
    public void setBlackAndWhitePageCount(@javax.annotation.Nullable final Integer value) {
        this._blackAndWhitePageCount = value;
    }
    /**
     * Sets the colorPageCount property value. The number of color pages that were printed. Read-only.
     * @param value Value to set for the colorPageCount property.
     * @return a void
     */
    public void setColorPageCount(@javax.annotation.Nullable final Integer value) {
        this._colorPageCount = value;
    }
    /**
     * Sets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     * @param value Value to set for the completionDateTime property.
     * @return a void
     */
    public void setCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completionDateTime = value;
    }
    /**
     * Sets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @param value Value to set for the copiesPrinted property.
     * @return a void
     */
    public void setCopiesPrinted(@javax.annotation.Nullable final Integer value) {
        this._copiesPrinted = value;
    }
    /**
     * Sets the createdBy property value. The user who created the print job. Read-only.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the duplexPageCount property value. The number of duplex (double-sided) pages that were printed. Read-only.
     * @param value Value to set for the duplexPageCount property.
     * @return a void
     */
    public void setDuplexPageCount(@javax.annotation.Nullable final Integer value) {
        this._duplexPageCount = value;
    }
    /**
     * Sets the id property value. The archived print job's GUID. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the pageCount property value. The total number of pages that were printed. Read-only.
     * @param value Value to set for the pageCount property.
     * @return a void
     */
    public void setPageCount(@javax.annotation.Nullable final Integer value) {
        this._pageCount = value;
    }
    /**
     * Sets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @param value Value to set for the printerId property.
     * @return a void
     */
    public void setPrinterId(@javax.annotation.Nullable final String value) {
        this._printerId = value;
    }
    /**
     * Sets the processingState property value. The processingState property
     * @param value Value to set for the processingState property.
     * @return a void
     */
    public void setProcessingState(@javax.annotation.Nullable final PrintJobProcessingState value) {
        this._processingState = value;
    }
    /**
     * Sets the simplexPageCount property value. The number of simplex (single-sided) pages that were printed. Read-only.
     * @param value Value to set for the simplexPageCount property.
     * @return a void
     */
    public void setSimplexPageCount(@javax.annotation.Nullable final Integer value) {
        this._simplexPageCount = value;
    }
}
