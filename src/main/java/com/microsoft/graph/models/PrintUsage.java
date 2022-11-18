package com.microsoft.graph.models;

import com.microsoft.graph.models.PrintUsageByPrinter;
import com.microsoft.graph.models.PrintUsageByUser;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class PrintUsage extends Entity implements Parsable {
    /** The blackAndWhitePageCount property */
    private Long _blackAndWhitePageCount;
    /** The colorPageCount property */
    private Long _colorPageCount;
    /** The completedBlackAndWhiteJobCount property */
    private Long _completedBlackAndWhiteJobCount;
    /** The completedColorJobCount property */
    private Long _completedColorJobCount;
    /** The completedJobCount property */
    private Long _completedJobCount;
    /** The doubleSidedSheetCount property */
    private Long _doubleSidedSheetCount;
    /** The incompleteJobCount property */
    private Long _incompleteJobCount;
    /** The mediaSheetCount property */
    private Long _mediaSheetCount;
    /** The pageCount property */
    private Long _pageCount;
    /** The singleSidedSheetCount property */
    private Long _singleSidedSheetCount;
    /** The usageDate property */
    private LocalDate _usageDate;
    /**
     * Instantiates a new printUsage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintUsage() {
        super();
        this.setOdataType("#microsoft.graph.printUsage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printUsage
     */
    @javax.annotation.Nonnull
    public static PrintUsage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.printUsageByPrinter": return new PrintUsageByPrinter();
                case "#microsoft.graph.printUsageByUser": return new PrintUsageByUser();
            }
        }
        return new PrintUsage();
    }
    /**
     * Gets the blackAndWhitePageCount property value. The blackAndWhitePageCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getBlackAndWhitePageCount() {
        return this._blackAndWhitePageCount;
    }
    /**
     * Gets the colorPageCount property value. The colorPageCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getColorPageCount() {
        return this._colorPageCount;
    }
    /**
     * Gets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedBlackAndWhiteJobCount() {
        return this._completedBlackAndWhiteJobCount;
    }
    /**
     * Gets the completedColorJobCount property value. The completedColorJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedColorJobCount() {
        return this._completedColorJobCount;
    }
    /**
     * Gets the completedJobCount property value. The completedJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedJobCount() {
        return this._completedJobCount;
    }
    /**
     * Gets the doubleSidedSheetCount property value. The doubleSidedSheetCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDoubleSidedSheetCount() {
        return this._doubleSidedSheetCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintUsage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("blackAndWhitePageCount", (n) -> { currentObject.setBlackAndWhitePageCount(n.getLongValue()); });
            this.put("colorPageCount", (n) -> { currentObject.setColorPageCount(n.getLongValue()); });
            this.put("completedBlackAndWhiteJobCount", (n) -> { currentObject.setCompletedBlackAndWhiteJobCount(n.getLongValue()); });
            this.put("completedColorJobCount", (n) -> { currentObject.setCompletedColorJobCount(n.getLongValue()); });
            this.put("completedJobCount", (n) -> { currentObject.setCompletedJobCount(n.getLongValue()); });
            this.put("doubleSidedSheetCount", (n) -> { currentObject.setDoubleSidedSheetCount(n.getLongValue()); });
            this.put("incompleteJobCount", (n) -> { currentObject.setIncompleteJobCount(n.getLongValue()); });
            this.put("mediaSheetCount", (n) -> { currentObject.setMediaSheetCount(n.getLongValue()); });
            this.put("pageCount", (n) -> { currentObject.setPageCount(n.getLongValue()); });
            this.put("singleSidedSheetCount", (n) -> { currentObject.setSingleSidedSheetCount(n.getLongValue()); });
            this.put("usageDate", (n) -> { currentObject.setUsageDate(n.getLocalDateValue()); });
        }};
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIncompleteJobCount() {
        return this._incompleteJobCount;
    }
    /**
     * Gets the mediaSheetCount property value. The mediaSheetCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMediaSheetCount() {
        return this._mediaSheetCount;
    }
    /**
     * Gets the pageCount property value. The pageCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPageCount() {
        return this._pageCount;
    }
    /**
     * Gets the singleSidedSheetCount property value. The singleSidedSheetCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSingleSidedSheetCount() {
        return this._singleSidedSheetCount;
    }
    /**
     * Gets the usageDate property value. The usageDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getUsageDate() {
        return this._usageDate;
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
        writer.writeLongValue("blackAndWhitePageCount", this.getBlackAndWhitePageCount());
        writer.writeLongValue("colorPageCount", this.getColorPageCount());
        writer.writeLongValue("completedBlackAndWhiteJobCount", this.getCompletedBlackAndWhiteJobCount());
        writer.writeLongValue("completedColorJobCount", this.getCompletedColorJobCount());
        writer.writeLongValue("completedJobCount", this.getCompletedJobCount());
        writer.writeLongValue("doubleSidedSheetCount", this.getDoubleSidedSheetCount());
        writer.writeLongValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeLongValue("mediaSheetCount", this.getMediaSheetCount());
        writer.writeLongValue("pageCount", this.getPageCount());
        writer.writeLongValue("singleSidedSheetCount", this.getSingleSidedSheetCount());
        writer.writeLocalDateValue("usageDate", this.getUsageDate());
    }
    /**
     * Sets the blackAndWhitePageCount property value. The blackAndWhitePageCount property
     * @param value Value to set for the blackAndWhitePageCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlackAndWhitePageCount(@javax.annotation.Nullable final Long value) {
        this._blackAndWhitePageCount = value;
    }
    /**
     * Sets the colorPageCount property value. The colorPageCount property
     * @param value Value to set for the colorPageCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColorPageCount(@javax.annotation.Nullable final Long value) {
        this._colorPageCount = value;
    }
    /**
     * Sets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @param value Value to set for the completedBlackAndWhiteJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedBlackAndWhiteJobCount(@javax.annotation.Nullable final Long value) {
        this._completedBlackAndWhiteJobCount = value;
    }
    /**
     * Sets the completedColorJobCount property value. The completedColorJobCount property
     * @param value Value to set for the completedColorJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedColorJobCount(@javax.annotation.Nullable final Long value) {
        this._completedColorJobCount = value;
    }
    /**
     * Sets the completedJobCount property value. The completedJobCount property
     * @param value Value to set for the completedJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedJobCount(@javax.annotation.Nullable final Long value) {
        this._completedJobCount = value;
    }
    /**
     * Sets the doubleSidedSheetCount property value. The doubleSidedSheetCount property
     * @param value Value to set for the doubleSidedSheetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDoubleSidedSheetCount(@javax.annotation.Nullable final Long value) {
        this._doubleSidedSheetCount = value;
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompleteJobCount(@javax.annotation.Nullable final Long value) {
        this._incompleteJobCount = value;
    }
    /**
     * Sets the mediaSheetCount property value. The mediaSheetCount property
     * @param value Value to set for the mediaSheetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaSheetCount(@javax.annotation.Nullable final Long value) {
        this._mediaSheetCount = value;
    }
    /**
     * Sets the pageCount property value. The pageCount property
     * @param value Value to set for the pageCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPageCount(@javax.annotation.Nullable final Long value) {
        this._pageCount = value;
    }
    /**
     * Sets the singleSidedSheetCount property value. The singleSidedSheetCount property
     * @param value Value to set for the singleSidedSheetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSidedSheetCount(@javax.annotation.Nullable final Long value) {
        this._singleSidedSheetCount = value;
    }
    /**
     * Sets the usageDate property value. The usageDate property
     * @param value Value to set for the usageDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageDate(@javax.annotation.Nullable final LocalDate value) {
        this._usageDate = value;
    }
}
